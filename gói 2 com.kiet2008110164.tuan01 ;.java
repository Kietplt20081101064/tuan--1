gói  com.kiet2008110164.tuan01 ;

nhập  java.util.Scanner ;

 lớp  công cộng Lab1Bai2 {
    public  static  void  main ( String [] args ) {
       Máy quét sc =   Máy quét mới  ( Hệ thống . In);
       Hệ thống . ra ngoài . println ( " Nhap 2 canh cua hinh chu nhat: " );
       double canh1 = sc . nextDouble ();
       double canh2 = sc . nextDouble ();
       Hệ thống . ra ngoài . println ( " Dien tich = "  + canh1 * canh2);
       Hệ thống . ra ngoài . println ( " Chu vi = "  + (canh1 + canh2) * 2 );
       Hệ thống . ra ngoài . println ( " Canh nho nhat la: "  +  Math . min (canh1, canh2));
       sc . gần();
    }  
}