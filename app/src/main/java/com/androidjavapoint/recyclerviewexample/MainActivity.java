package com.androidjavapoint.recyclerviewexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(llm);

        List<Employee> employeeList = prepareEmployeeList();

        EmployeeListAdapter ca = new EmployeeListAdapter(employeeList);
        recyclerView.setAdapter(ca);
    }

    private List<Employee> prepareEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();

        for (int i = 1; i < 20; i++) {
            employeeList.add(new Employee("Employee " + i, i * 1000));
        }
        return employeeList;
    }
}
