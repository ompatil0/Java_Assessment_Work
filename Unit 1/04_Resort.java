// 4. Define a class Resort with the following description:
//  Members are: RNo to store Room Number, Name store customer name,
// Charges to store per day charges, Days to store number of days of stay.
//  Member functions:
//  Compute() to calculate and return Amount as Days * Charges and if the
// values of Days*Charges is more than 11000 then as 1.02*Days*Charges
//  Getinfo() A function to enter the content Rno, Name, Charges and Days.
//  DispInfo() A function to enter the content Rno, Name, Charges, Days and
// Amount by calling function Compute().

import java.util.*;

class Resort {
    int Rno, Days;
    String Name;
    double Charges;

    double Compute() {
        double amount = Days * Charges;
        if(amount > 11000)
            amount = amount * 1.02;
        return amount;
    }

    void Getinfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Room No: ");
        Rno = sc.nextInt();
        System.out.print("Name: ");
        Name = sc.next();
        System.out.print("Charges: ");
        Charges = sc.nextDouble();
        System.out.print("Days: ");
        Days = sc.nextInt();
    }

    void DispInfo() {
        System.out.println("Room No: " + Rno);
        System.out.println("Name: " + Name);
        System.out.println("Charges: " + Charges);
        System.out.println("Days: " + Days);
        System.out.println("Amount: " + Compute());
    }

    public static void main(String[] args) {
        Resort r = new Resort();
        r.Getinfo();
        r.DispInfo();
    }
}