package com.soeasy.event;

import java.util.Vector;

/**
 * Author:hermit
 * CreateDate:18/1/30
 */
public class EventSource {
    private Vector<CustomEventListener> ListenerList = new Vector<CustomEventListener>();

    public void addListener(CustomEventListener eventListener) {
        ListenerList.add(eventListener);
    }

    public void removeListener(CustomEventListener eventListener) {
        ListenerList.remove(eventListener);
    }

    public void notifyListenerEvents(CustomEventObject event) {
        for (CustomEventListener eventListener : ListenerList) {
            eventListener.handleEvent(event);
        }
    }

    public static void main(String[] args) {
        EventSource eventSource = new EventSource();

        eventSource.addListener(new CustomEventListener() {
            @Override
            public void handleEvent(CustomEventObject event) {
                event.doEvent();
                if (event.getSource().equals("closeWindows")) {
                    System.out.println("doClose");
                }
            }

        });

        eventSource.notifyListenerEvents(new CustomEventObject("openWindows"));

    }

}
