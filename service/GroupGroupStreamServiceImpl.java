package service;

import data.GroupStream;
import data.comparators.GroupStreamComparator;

import java.util.List;
import java.util.Collections;

public class GroupGroupStreamServiceImpl implements GroupStreamService {
    @Override
    public void streamSort(List<GroupStream> groupStream) {
        Collections.sort(groupStream, new GroupStreamComparator());
    }
}
