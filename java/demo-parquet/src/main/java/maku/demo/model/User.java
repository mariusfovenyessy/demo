/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package maku.demo.model;  
@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class User extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"User\",\"namespace\":\"maku.demo.model\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"email\",\"type\":\"string\"},{\"name\":\"age\",\"type\":[\"int\",\"null\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }
  @Deprecated public java.lang.CharSequence name;
  @Deprecated public java.lang.CharSequence email;
  @Deprecated public java.lang.Integer age;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>. 
   */
  public User() {}

  /**
   * All-args constructor.
   */
  public User(java.lang.CharSequence name, java.lang.CharSequence email, java.lang.Integer age) {
    this.name = name;
    this.email = email;
    this.age = age;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call. 
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return email;
    case 2: return age;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }
  // Used by DatumReader.  Applications should not call. 
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: email = (java.lang.CharSequence)value$; break;
    case 2: age = (java.lang.Integer)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }

  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'email' field.
   */
  public java.lang.CharSequence getEmail() {
    return email;
  }

  /**
   * Sets the value of the 'email' field.
   * @param value the value to set.
   */
  public void setEmail(java.lang.CharSequence value) {
    this.email = value;
  }

  /**
   * Gets the value of the 'age' field.
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.Integer value) {
    this.age = value;
  }

  /** Creates a new User RecordBuilder */
  public static maku.demo.model.User.Builder newBuilder() {
    return new maku.demo.model.User.Builder();
  }
  
  /** Creates a new User RecordBuilder by copying an existing Builder */
  public static maku.demo.model.User.Builder newBuilder(maku.demo.model.User.Builder other) {
    return new maku.demo.model.User.Builder(other);
  }
  
  /** Creates a new User RecordBuilder by copying an existing User instance */
  public static maku.demo.model.User.Builder newBuilder(maku.demo.model.User other) {
    return new maku.demo.model.User.Builder(other);
  }
  
  /**
   * RecordBuilder for User instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<User>
    implements org.apache.avro.data.RecordBuilder<User> {

    private java.lang.CharSequence name;
    private java.lang.CharSequence email;
    private java.lang.Integer age;

    /** Creates a new Builder */
    private Builder() {
      super(maku.demo.model.User.SCHEMA$);
    }
    
    /** Creates a Builder by copying an existing Builder */
    private Builder(maku.demo.model.User.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.email)) {
        this.email = data().deepCopy(fields()[1].schema(), other.email);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
    }
    
    /** Creates a Builder by copying an existing User instance */
    private Builder(maku.demo.model.User other) {
            super(maku.demo.model.User.SCHEMA$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.email)) {
        this.email = data().deepCopy(fields()[1].schema(), other.email);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
    }

    /** Gets the value of the 'name' field */
    public java.lang.CharSequence getName() {
      return name;
    }
    
    /** Sets the value of the 'name' field */
    public maku.demo.model.User.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this; 
    }
    
    /** Checks whether the 'name' field has been set */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }
    
    /** Clears the value of the 'name' field */
    public maku.demo.model.User.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /** Gets the value of the 'email' field */
    public java.lang.CharSequence getEmail() {
      return email;
    }
    
    /** Sets the value of the 'email' field */
    public maku.demo.model.User.Builder setEmail(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.email = value;
      fieldSetFlags()[1] = true;
      return this; 
    }
    
    /** Checks whether the 'email' field has been set */
    public boolean hasEmail() {
      return fieldSetFlags()[1];
    }
    
    /** Clears the value of the 'email' field */
    public maku.demo.model.User.Builder clearEmail() {
      email = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /** Gets the value of the 'age' field */
    public java.lang.Integer getAge() {
      return age;
    }
    
    /** Sets the value of the 'age' field */
    public maku.demo.model.User.Builder setAge(java.lang.Integer value) {
      validate(fields()[2], value);
      this.age = value;
      fieldSetFlags()[2] = true;
      return this; 
    }
    
    /** Checks whether the 'age' field has been set */
    public boolean hasAge() {
      return fieldSetFlags()[2];
    }
    
    /** Clears the value of the 'age' field */
    public maku.demo.model.User.Builder clearAge() {
      age = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    public User build() {
      try {
        User record = new User();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.email = fieldSetFlags()[1] ? this.email : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.age = fieldSetFlags()[2] ? this.age : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }
}
