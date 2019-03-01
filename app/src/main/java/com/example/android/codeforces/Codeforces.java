package com.example.android.codeforces;

public class Codeforces {

private String mName;
private Integer mDuration;
private Integer mStartTime;
private Enum mPhase;

public Codeforces(String name ,Integer duration ,Integer startTime ,Enum phase){


    mName = name;
    mDuration=duration;
    mStartTime=startTime;
    mPhase=phase;

}


    public String getmName() {
        return mName;
    }

    public Integer getmDuration() {
        return mDuration;
    }

    public Integer getmStartTime() {
        return mStartTime;
    }

    public Enum getmPhase() {
        return mPhase;
    }
}