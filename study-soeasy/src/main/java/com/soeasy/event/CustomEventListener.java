package com.soeasy.event;

import java.util.EventListener;
import java.util.EventObject;

/**
 * Author:hermit
 * CreateDate:18/1/30
 */
public interface CustomEventListener extends EventListener {

    public void handleEvent(CustomEventObject event);

}
