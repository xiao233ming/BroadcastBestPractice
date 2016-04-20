package com.example.mingming.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mingming on 2016/4/20.
 */
public class ActivityCollector {

    public static List<Activity> activities = new ArrayList<>();

    //添加活动
    public static void addActivity(Activity activity){
        activities.add(activity);
    }
    //移除活动
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    //销毁所有活动
    public static void finishAll(){
        for(Activity activity : activities){
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
