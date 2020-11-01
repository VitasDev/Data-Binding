package com.cubesolver.databindindproj;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.cubesolver.databindindproj.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Employee employee = new Employee(1, "John Smith", "London", 10000);
        Department department = new Department(100, "IT");

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setEmployee(employee);
        binding.setDepartment(department);

    }
}
