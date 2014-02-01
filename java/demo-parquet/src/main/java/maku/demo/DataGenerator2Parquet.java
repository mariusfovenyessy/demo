package maku.demo;

import maku.demo.model.User;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import parquet.avro.AvroParquetWriter;
import parquet.hadoop.ParquetWriter;
import parquet.hadoop.metadata.CompressionCodecName;

/**
 * <pre>
 * Generates Avro - User records and writes them into a parquet file.
 * The class should be launched as bellow:
 *    java maku.demo.DataGenerator2Parquet <outputFileName> <recordsNumber>
 * </pre>
 * 
 * @author maku
 */
public class DataGenerator2Parquet {

	private final static int blockSize = ParquetWriter.DEFAULT_BLOCK_SIZE;
	private final static int pageSize = ParquetWriter.DEFAULT_PAGE_SIZE;
	private final static boolean dictEnabled = false;

	/**/
	public static void main(String[] args) throws Exception {
		new DataGenerator2Parquet().run(args);
	}

	/**/
	private void run(String args[]) throws Exception {
		// handle arguments
		if (args.length < 2) {
			System.out.println("Usage " + getClass().getName()
					+ " OUTPUTFILENAME NO_RECORDS [compression]");
			System.exit(-1);
		}
		String outputFilePath = args[0];
		long noRecords = Integer.parseInt(args[1]);
		String compression = (args.length > 2) ? args[2] : "none";

		//
		Configuration conf = new Configuration();
		FileSystem fs = FileSystem.get(conf);
		Path path = new Path(outputFilePath);
		if (fs.exists(path)) {
			fs.delete(path, true);
		}

		// AvroParquetWriter<User> writer = new AvroParquetWriter<User>(path,
		// User.getClassSchema());
		CompressionCodecName comp = CompressionCodecName.UNCOMPRESSED;
		if (compression.equalsIgnoreCase("gzip")) {
			comp = CompressionCodecName.GZIP;
		} else if (compression.equalsIgnoreCase("snappy")) {
			comp = CompressionCodecName.SNAPPY;
		}

		AvroParquetWriter<User> writer = new AvroParquetWriter<User>(path,
				User.getClassSchema(), comp, blockSize, pageSize, dictEnabled);

		// generate some records
		User user = null;
		for (int l = 0; l < noRecords; l++) {
			user = new User();
			user.setName("User" + l);
			user.setEmail("email" + l + "@test.com");
			user.setAge(l % 80); // :)
			
			//
			writer.write(user);
			
			
			if (l%1000000==0){
				System.out.println(l+" from "+noRecords+" recoreds written....");
			}
		}

		writer.close();

		System.out.println("Finished! " + noRecords
				+ " number of users were written to " + outputFilePath);
	}

}
