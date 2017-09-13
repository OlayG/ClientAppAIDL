// IEventbrite.aidl
package com.example.admin.clientappaidl;
import java.util.List;
import com.example.admin.clientappaidl.Event;

// Declare any non-default types here with import statements

interface IEventbrite {

    int getPid();
    List<Event> getEvents();

}
