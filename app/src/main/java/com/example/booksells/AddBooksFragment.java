package com.example.booksells;


import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;

import static android.app.Activity.RESULT_OK;


public class AddBooksFragment extends Fragment {

    private TextView currentDate,currentTime;
    private EditText bookName,writerName,publicationname,picAddress,sellPrice;
    private Spinner versionSpinner,levelSpenner,classSpinner;
    private ImageView frontIV,leftIV,rightIV,cornerIV;
    private Button sellButtn;
    DatePickerDialog.OnDateSetListener onDateSetListener;



    public AddBooksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view =  inflater.inflate(R.layout.fragment_add_books, container, false);

      currentDate = view.findViewById(R.id.currentDate);
      versionSpinner = view.findViewById(R.id.versionSpinner);
      levelSpenner = view.findViewById(R.id.levelSpenner);
      classSpinner = view.findViewById(R.id.classSpenner);
      currentTime = view.findViewById(R.id.currentTime);
      frontIV = view.findViewById(R.id.frontImage);
      leftIV = view.findViewById(R.id.leftAngle);
      rightIV = view.findViewById(R.id.rightAngleImage);
      cornerIV = view.findViewById(R.id.cornerImage);
      bookName = view.findViewById(R.id.bookName);
      publicationname= view.findViewById(R.id.publicationName);
      writerName = view.findViewById(R.id.addwriter);
      picAddress = view.findViewById(R.id.picAdress);
      sellPrice = view.findViewById(R.id.sellPrice);
      sellButtn = view.findViewById(R.id.sellButtn);


        currentDate();
        currentTime();
        version();
        levelSpenner();
        classSpinner();

        CameraView();





   return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK){

            if (requestCode == 0){

                Bundle bundle = data.getExtras();
                Bitmap bitmap = (Bitmap) bundle.get("data");
                frontIV.setImageBitmap(bitmap);
            }
            else if (requestCode == 1){
                Bundle bundle = data.getExtras();
                Bitmap bitmap = (Bitmap) bundle.get("data");
                leftIV.setImageBitmap(bitmap);

            }
            else if (requestCode == 2){

                Bundle bundle = data.getExtras();
                Bitmap bitmap = (Bitmap) bundle.get("data");
                rightIV.setImageBitmap(bitmap);

            }
            else if (requestCode == 3){

                Bundle bundle = data.getExtras();
                Bitmap bitmap = (Bitmap) bundle.get("data");
                cornerIV.setImageBitmap(bitmap);
            }
        }

    }

    private void CameraView() {
        frontIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);


            }
        });

        leftIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,1);
            }
        });

        rightIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,2);
            }
        });

        cornerIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,3);
            }
        });



    }

    private void classSpinner() {

        final ArrayList<String> ClassList =new ArrayList<>();

        ClassList.add("Play");
        ClassList.add("Nersery");
        ClassList.add("One");
        ClassList.add("Two");
        ClassList.add("Three");
        ClassList.add("Four");
        ClassList.add("Five");
        ClassList.add("Six");
        ClassList.add("Seven");
        ClassList.add("Eight");
        ClassList.add("Nine");
        ClassList.add("Ten");
        ClassList.add("Eleven");
        ClassList.add("Twelve");
        ClassList.add("1st Semester");
        ClassList.add("2nd Semester");
        ClassList.add("3rd Semester");
        ClassList.add("4th Semester");
        ClassList.add("5th Semester");
        ClassList.add("6th Semester");
        ClassList.add("7th Semester");
        ClassList.add("8th Semester");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),R.layout.support_simple_spinner_dropdown_item,ClassList);
        classSpinner.setAdapter(adapter);
        classSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getActivity(), "Sumon", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    private void levelSpenner() {
        final ArrayList<String> Levellist =new ArrayList<>();

        Levellist.add("School");
        Levellist.add("Collage");
        Levellist.add("University");
        Levellist.add("Madrasah");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),R.layout.support_simple_spinner_dropdown_item,Levellist);
        levelSpenner.setAdapter(adapter);
        levelSpenner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getActivity(), "Sumon", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }

    private void currentTime() {

       currentTime.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Calendar calendar = Calendar.getInstance();
               int hour = calendar.get(Calendar.HOUR_OF_DAY);
               int minute = calendar.get(Calendar.MINUTE);

               TimePickerDialog timePickerDialog;
               timePickerDialog = new TimePickerDialog(getContext(), new TimePickerDialog.OnTimeSetListener() {
                   @Override
                   public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                       currentTime.setText(hourOfDay + ":"+minute);
                   }
               },hour,minute,true);
               timePickerDialog.setTitle("Choose Time");
               timePickerDialog.show();
           }
       });


    }

    private void currentDate() {
        currentDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(getContext(),onDateSetListener,year,month,day);

                datePickerDialog.show();
            }
        });

        onDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                month = month+1;
                String date = dayOfMonth+"/"+month+"/"+year;
                currentDate.setText(date);
            }
        };


    }

    private void version() {

        final ArrayList<String> VersionList =new ArrayList<>();

        VersionList.add("New");
        VersionList.add("Old");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),R.layout.support_simple_spinner_dropdown_item,VersionList);
        versionSpinner.setAdapter(adapter);
        versionSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getActivity(), "Sumon", Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

}
