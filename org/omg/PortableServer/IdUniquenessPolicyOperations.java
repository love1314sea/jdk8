package org.omg.PortableServer;


/**
* org/omg/PortableServer/IdUniquenessPolicyOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u71/5731/corba/src/share/classes/org/omg/PortableServer/poa.idl
* Tuesday, December 22, 2015 3:13:22 PM PST
*/


/**
	 * The IdUniquenessPolicy specifies whether the servants 
	 * activated in the created POA must have unique object i
	 * identities. The default is UNIQUE_ID.
	 */
public interface IdUniquenessPolicyOperations  extends org.omg.CORBA.PolicyOperations
{

  /**
  	 * specifies the policy value
  	 */
  org.omg.PortableServer.IdUniquenessPolicyValue value ();
} // interface IdUniquenessPolicyOperations
