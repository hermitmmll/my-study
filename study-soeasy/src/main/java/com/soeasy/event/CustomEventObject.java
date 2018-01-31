package com.soeasy.event;

import java.util.EventObject;

/**
 * Author:hermit
 * CreateDate:18/1/30
 */
public class CustomEventObject extends EventObject {

    public CustomEventObject(Object source) {
        super(source);
    }

    public void doEvent() {
        System.out.println("通知一个事件源 source :"+ this.getSource());
    }
}
