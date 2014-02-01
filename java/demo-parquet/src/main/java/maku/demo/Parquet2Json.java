package maku.demo;

import java.io.PrintWriter;

import maku.demo.model.User;

import org.apache.hadoop.fs.Path;

import parquet.Log;
import parquet.avro.AvroParquetReader;

/**
 * <pre>
 * The following example demonstrates  how to read a Parquet file data and write it in a JSON file format, keeping the schema unchanged.
 * </pre>
 * 
 * @author maku
 */
public class Parquet2Json {

	private static final Log logger = Log.getLog(Parquet2Json.class);

	public static void main(String args[]) throws Exception {
		new Parquet2Json().run(args);
	}

	/**/
	private int run(String[] args) throws Exception {
		if (args.length != 2) {
			logger.error("Usage: " + getClass().getName() + " INPUTFILE OUTPUTFILE");
			return 1;
		}

		String parquetFilePath = args[0];
		String outputFile = args[1];

		PrintWriter pr = new PrintWriter(outputFile);

		// Automatically detects the compression algorithm.
		AvroParquetReader<User> reader = new AvroParquetReader<>(new Path(parquetFilePath));

		User user = null;
		long count = 0;
		do {
			user = reader.read();
			if (user != null) {
				count++;
				pr.println(user);
			}
		} while (user != null);

		pr.close();

		System.out.println("Finished! [" + count + "] json records were written into the [" + outputFile + "] file.");
		return 0;
	}

}
