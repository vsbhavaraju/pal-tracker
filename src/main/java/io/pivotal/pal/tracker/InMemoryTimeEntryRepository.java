package io.pivotal.pal.tracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InMemoryTimeEntryRepository implements TimeEntryRepository{

    private HashMap<Long,TimeEntry> timeEntryHashMap = new HashMap<>();


    public InMemoryTimeEntryRepository() {
        super();
    }


    @Override
    public TimeEntry create(TimeEntry timeEntry) {

            timeEntry.setId(timeEntryHashMap.size()+1);
            timeEntryHashMap.put(timeEntry.getId(),timeEntry);

        return timeEntry;
    }

    @Override
    public TimeEntry find(long l) {

       TimeEntry timeEntry = timeEntryHashMap.get(l);

        return timeEntry ;
    }

    @Override
    public List<TimeEntry> list() {
        return new ArrayList<>(timeEntryHashMap.values());
    }

    @Override
    public TimeEntry update(long eq, TimeEntry any) {

        any.setId(eq);

        timeEntryHashMap.put(eq,any);


        return timeEntryHashMap.get(eq);
    }

    @Override
    public void delete(long id) {

        timeEntryHashMap.remove(id);

    }
}
