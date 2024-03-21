class p8
{
	public static void main(String args[])
	{
		boolean bool=true;
		int i=1910;
		float f=10f;
		long l=19102004l;
		short s=19;
		char c='D';
		double d=191004d;
		byte b=19;
		
		//autoboxing
		Boolean boolobj = Boolean.valueOf(bool);
		Integer iobj=Integer.valueof(i);
		Float fobj=Float.valueof(f);
		Long lobj=Long.valueOf(l);
		Short sobj=Short.valueOf(s);
		Character cobj=Character.valueOf(c);
		Double dobj=Double.valueOf(d);
		Byte bobj=Byte.valueOf(b);
		
		System.out.println(boolobj);
		System.out.println(iobj);
		System.out.println(fobj);
		System.out.println(lobj);
		System.out.println(sobj);
		System.out.println(cobj);
		System.out.println(dobj);
		System.out.println(bobj);
		
		//unboxing
		boolean boolobj1 = boolobj.booleanValue();
		int iobj1=intobj.intValue();
		float fobj1=floatobj.floatValue();
		long lobj1=longobj.longValue();
		short sobj1=shortobj.shortValue();
		char cobj1=charobj.charValue();
		double dobj1=doubleobj.doubleValue();
		byte obj1=byteobj.byteValue();
		
		System.out.println(boolobj1);
		System.out.println(iobj1);
		System.out.println(fobj1);
		System.out.println(lobj1);
		System.out.println(sobj1);
		System.out.println(cobj1);
		System.out.println(dobj1);
		System.out.println(bobj1);
		
	}
}