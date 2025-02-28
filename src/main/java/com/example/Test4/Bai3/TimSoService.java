package com.example.Test4.Bai3;

public class TimSoService {
    public Integer timSo(int[] daySo){
        if (daySo == null || daySo.length<2){
            return null;
        }
        int soLonNhat = Integer.MIN_VALUE;
        Integer soLonNhi = null;
        for (int so : daySo){
            if (so > soLonNhat){
                soLonNhi = soLonNhat;
                soLonNhat = so;
            }
        }
        return soLonNhi;
    }
}
