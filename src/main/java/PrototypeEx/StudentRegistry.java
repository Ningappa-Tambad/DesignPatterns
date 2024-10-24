package PrototypeEx;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry
{
    private Map<String, Student> studentMap=new HashMap<>();

    public void Register(String key, Student student)
    {
        studentMap.put(key, student);
    }

    public Student getKey(String key)
    {
        return studentMap.get(key);
    }
}
