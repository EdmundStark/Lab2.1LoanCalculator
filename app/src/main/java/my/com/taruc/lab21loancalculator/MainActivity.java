package my.com.taruc.lab21loancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String MONTHLY_PAYMENT = "payment";
    public static final String LOAN_STATUS = "status";


    private EditText editTextCarPrice, editTextDownPayment, editTextLoadPeriod,editTextInterestRate ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void calculateLoan(View view){
        // Create an Explicit intent
        Intent intent = new Intent(this, ResultActivity.class);


        //TODO : calculte monthly payment and determine
        // loan application status; approve or reject


        String status= "Approve";

        double vehiclePrice, downPayment, rePayment, intrestRate;
        double totalIntrest, totalLoan, monthlyPayment;

        editTextCarPrice = (EditText)findViewById(R.id.editTextCarPrice);
        editTextDownPayment = (EditText)findViewById(R.id.editTextDownPayment);
        editTextLoadPeriod = (EditText)findViewById(R.id.editTextLoadPeriod);
        editTextInterestRate = (EditText)findViewById(R.id.editTextInterestRate);

        vehiclePrice = Double.parseDouble(editTextCarPrice.getText().toString());
        downPayment = Double.parseDouble(editTextDownPayment.getText().toString());
        rePayment = Double.parseDouble(editTextLoadPeriod.getText().toString());
        intrestRate =Double.parseDouble(editTextInterestRate.getText().toString());

        totalIntrest = (vehiclePrice - downPayment)*intrestRate*(rePayment/12);
        totalLoan

        //Passing data using putExtra method
        //putExtra(TAG,value)
        intent.putExtra(MONTHLY_PAYMENT,monthlyPayment);
        intent.putExtra(LOAN_STATUS,status);
        startActivity(intent);
    }

}
