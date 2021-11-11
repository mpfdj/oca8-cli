// * can only be used a wildcard for class names not package names

// This is the default java package name, this package is automatically imported
// import java.lang.*;

import java.util.Date;  // The fqn is prefered over the wildcard import
//import java.sql.Date;  // error: a type with the same simple name is already defined
import java.sql.*;

class Imports {
	
	public static void main(String args[]) {
		Date d = new Date();
		System.out.println(d.getClass().getName());  // is using java.util.Date
		
		// using fqn here
		java.sql.Date d2 = new java.sql.Date(2016, 12, 31);
		System.out.println(d2.getClass().getName());  // is using java.sql.Date
	}
	
}