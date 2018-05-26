package riztech.com.myfirstproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText edtEmployeeId, edtEmployeeName, edtEmployeeAddress;
    Spinner spnCity, spnCountry;
    RadioGroup rdgGender;
    RadioButton rdbMale, rdbFemale;
    CheckBox chb10th, chb12th, chbGraduation, chbPostGraduation;
    Button btnSubmit;

    String[] countries = {"India", "Canada", "USA", "UK"};

    String[] cities = {"Pune", "Indore", "Mumbai", "Nagpur"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtEmployeeAddress = findViewById(R.id.edt_employee_address);
        edtEmployeeId = findViewById(R.id.edt_emaployee_id);
        edtEmployeeName = findViewById(R.id.edt_employee_name);
        spnCity = findViewById(R.id.spn_city);
        spnCountry = findViewById(R.id.spn_country);
        rdgGender = findViewById(R.id.rdg_gender);
        rdbFemale = findViewById(R.id.rdb_female);
        rdbMale = findViewById(R.id.rdb_male);

        chb10th = findViewById(R.id.chb_10th);
        chb12th = findViewById(R.id.chb_12th);
        chbGraduation = findViewById(R.id.chb_graduation);
        chbPostGraduation = findViewById(R.id.chb_post_graduation);
        btnSubmit = findViewById(R.id.btn_submit);

        ArrayAdapter<String> countryAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, countries);
        spnCountry.setAdapter(countryAdapter);

        ArrayAdapter<String> cityAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, cities);
        spnCity.setAdapter(cityAdapter);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String employeeId = edtEmployeeId.getText().toString().trim();
                String employeeName = edtEmployeeName.getText().toString().trim();


            }
        });

    }
}
