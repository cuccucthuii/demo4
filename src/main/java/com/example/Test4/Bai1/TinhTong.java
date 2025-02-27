package com.example.Test4.Bai1;

public class TinhTong {
    // tinh tong thuong
    public int tinhTong(int[] daySo){
        int tong = 0;
        for (int so : daySo){
            tong += so;
        }
        System.out.println("Tong bang: " +tong);
        return tong;
    }
    // tinh tong so chan
    public int tinhTongChan(int[] daySo){
        int tong = 0;
        for (int so : daySo){
            if (so % 2 == 0){
                tong += so;
            }
        }
        System.out.println("Tong bang: " +tong);
        return tong;
    }

    // tinh tong so le
    public int tinhTongLe(int[] daySo){
        int tong = 0;
        for (int so : daySo){
            if (so % 2 != 0){
                tong += so;
            }
        }
        System.out.println("Tong bang: "+tong);
        return tong;
    }

    // tinh tong chan va bo cac so chia het cho 6
    public int tinhTongChanDK6(int[] daySo){
        int tong = 0;
        for (int so : daySo){
            if (so % 2 == 0 && so % 6 != 0){
                tong += so;
            }
        }
        System.out.println("Tong so = " +tong);
        return tong;
    }

    // tinh tong so le va bo cac so chia het co 5
    public int tinhTongLeDK5(int[] daySo){
        int tong = 0;
        for (int so : daySo){
            if (so % 2 != 0 && so % 5 != 0){
                tong += so;
            }
        }
        System.out.println("Tong bang: "+tong);
        return tong;
    }

}
