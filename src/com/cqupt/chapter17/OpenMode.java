package com.cqupt.chapter17;

import java.util.ArrayList;

public interface OpenMode {

    // 将totalMoney分成totalCount份
    ArrayList<Integer> divide(int totalMoney,int totalCount);
}
