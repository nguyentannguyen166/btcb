package btcb;
import java.util.Scanner;

public class Bai_1 {
    
    public Bai_1(){}
    
    public void divisibleBy3(int n){
        System.out.print("So chia het 3: ");
        for(int i = 0; i < n+1; i++){
            if(i%3 == 0){
                System.out.print(i + " ");
            }
        }
    }
    
    public void numDivisibleBy3(int m, int n){
        int s = 0;
        for(int i = m; i < n+1; i++){
            if(i%3 == 0){
                s++;
            }
        }
        System.out.println("so luong so chia het cho 3 tu "+m+" den "+n+": "+s);
    }
    
    public void sumEvenNumber(int n){
        int s = 0;
        for(int i = 0; i < n+1; i++){
            if(i%2 == 0){
                s += i;
            }
        }
        System.out.println("Tinh tong cac so chan: "+s);
    }
    
    public void sumDivisibleBy3And5(int n){
        int s = 0;
        for(int i = 0; i < n+1; i++){
            if(i%3 == 0 && i%5 == 0){
                s += i;
            }
        }
        System.out.println("Tinh tong cac so chia het 3 va 5: "+s);
    }
    
    public void sumDivisibleBy3Or5(int m, int n){
        int s = 0;
        int k = 0;
        int f = 0;
        for(int i = m; i < n+1; i++){
            if(i%3 == 0 || i%5 == 0){
                s += i;
                f++;
                if(i%2 == 0){
                    k +=i;
                }
            }
        }
        if(m != 0){   
            System.out.println("So luong cac so chia het cho 3 hoac 5 tu "+m+" den "+n+": "+f);
            System.out.println("Tinh tong so chan chia het 3 tu "+m+" den "+n+": "+k);
        }else{
            System.out.println("Tinh tong cac so chia het 3 hoac 5 tu "+m+" den "+n+": "+s);
        }
    }
    public void divisor(int n){
        System.out.print("Uoc cua "+n+": ");
        for(int i = 1; i < n+1; i++){
            if( n%i == 0){
                System.out.print(i + " ");
            }
        }
    }
    
    public boolean checkSNT(int n){
        boolean checkSNT = false;
        int s = 0;
        if( n == 1 ){
            checkSNT = true;
        }else{
        for(int i = 1; i < n+1; i++){
            if(n%i == 0){s++;}
        }
        if(s == 2){checkSNT = true;}
        }
        return checkSNT;
    }
    
    
    public void SNTfromMtoN(int m, int n){
        int s = 0;
        int k = 0;
        System.out.print("SNT tu "+m+" den "+n+": ");
        for(int i = m; i < n+1; i++){
            boolean checkSNT = checkSNT(i);
            if(checkSNT == true){
                s++;
                k +=i;
                System.out.print(i+" ");
            }
        }
        float TBC = (float)k/s;
        System.out.println("\n-------Bai12----------");
        System.out.println("So luong snt tu "+m+" den "+n+": "+s);
        System.out.println("-------Bai13----------");
        System.out.println("Trung binh cong cac snt = "+TBC);
    }
    
    
    public void sumFromMtoN(int m, int n){
        int s = 0;
        for(int i = m; i <= n; i++){
            s +=i;
        }
        System.out.println("Tinh tong cac so tu m den n: "+s);      
    }
    
    public boolean checkInput(int m, int n){
        boolean checkInput = false;
        if(m <n){
            checkInput = true;
        }
        return checkInput;
    }
    
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("-------Nhap 1 so n----------");
        System.out.print("Nhap n: ");
        int n = myObj.nextInt();
        
        Bai_1 main = new Bai_1();
        System.out.println("\n-------Bai1----------");
        main.divisibleBy3(n);
        System.out.println("\n-------Bai2----------");
        main.numDivisibleBy3(0,n);
        System.out.println("-------Bai3----------");
        main.sumEvenNumber(n);
        System.out.println("-------Bai4----------");
        main.sumDivisibleBy3And5(n);
        System.out.println("-------Bai5----------");
        main.sumDivisibleBy3Or5(0,n);
        System.out.println("-------Bai6----------");
        main.divisor(n);
        System.out.println("\n-------Bai7----------");
        boolean checkSNT = main.checkSNT(n);
        if(checkSNT == true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
        System.out.println("\n-------Nhap 2 so m,n----------");
        System.out.print("Nhap m: ");
        int m = myObj.nextInt();
        System.out.print("Nhap n: ");
        n = myObj.nextInt();
        
        boolean check = main.checkInput(m, n);
        if(check == true){
        System.out.println("\n-------Bai8----------");
        main.sumFromMtoN(m, n);
        System.out.println("-------Bai9----------");
        main.numDivisibleBy3(m,n);
        System.out.println("-------Bai10----------");
        main.sumDivisibleBy3Or5(m, n);
        System.out.println("-------Bai11----------");
        main.SNTfromMtoN(m, n);         
        }else{
            System.out.println("---------------------");
            System.out.println("Nhap khong dung vui long nhap lai");
        }
    }
}
