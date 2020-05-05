package no2;

public class StaticVar{
public static String myStaticVar = "Variabel Kelas atau Statis";
public static void main(String[] args) {
StaticVar sv1 = new StaticVar();
StaticVar sv2 = new StaticVar();
StaticVar sv3 = new StaticVar();
System.out.println(sv1.myStaticVar);
System.out.println(sv2.myStaticVar);
System.out.println(sv3.myStaticVar);
sv2.myStaticVar="teks berubah";
System.out.println(sv1.myStaticVar);
System.out.println(sv2.myStaticVar);
System.out.println(sv3.myStaticVar);
}
}

