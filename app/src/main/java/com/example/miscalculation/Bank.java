package com.example.miscalculation;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Bank extends AppCompatActivity {


    static double priceLizZh;
    static double priceLizM;
    static double priceLizZhWPrepaid;
    static double priceLizMWPrepaid;
    static int prepaidLizZh;
    static int prepaidLizM;

    static int priceZ;
    static int priceM;

    static int minBank = 50;
    static int minLiz = 600;



    static final String rub = " руб";

    //АЛЬФА-БАНК
    static TextView Ames6Z;
    static TextView Ames10Z;
    static TextView Ames12Z;
    static TextView Ames15Z;
    static TextView Ames18Z;
    static TextView Ames24Z;
    static TextView Ames36Z;

    static TextView Ames6M;
    static TextView Ames10M;
    static TextView Ames12M;
    static TextView Ames15M;
    static TextView Ames18M;
    static TextView Ames24M;
    static TextView Ames36M;

    //ЕЖЕМЕСЯЧНЫЕ АЛЬФА
    static TextView Ames6EZ;
    static TextView Ames10EZ;
    static TextView Ames12EZ;
    static TextView Ames15EZ;
    static TextView Ames18EZ;
    static TextView Ames24EZ;
    static TextView Ames36EZ;

    static TextView Ames6EM;
    static TextView Ames10EM;
    static TextView Ames12EM;
    static TextView Ames15EM;
    static TextView Ames18EM;
    static TextView Ames24EM;
    static TextView Ames36EM;

    //ДОБРОБЫТ
    static TextView Dmes3Z;
    static TextView Dmes6Z;
    static TextView Dmes12Z;
    static TextView Dmes18Z;
    static TextView Dmes24Z;
    static TextView Dmes36Z;

    static TextView Dmes3M;
    static TextView Dmes6M;
    static TextView Dmes12M;
    static TextView Dmes18M;
    static TextView Dmes24M;
    static TextView Dmes36M;

    //ЕЖЕМЕСЯЧНЫЕ ДОБРОБЫТ
    static TextView Dmes3EZ;
    static TextView Dmes6EZ;
    static TextView Dmes12EZ;
    static TextView Dmes18EZ;
    static TextView Dmes24EZ;
    static TextView Dmes36EZ;

    static TextView Dmes3EM;
    static TextView Dmes6EM;
    static TextView Dmes12EM;
    static TextView Dmes18EM;
    static TextView Dmes24EM;
    static TextView Dmes36EM;


    //ЛИЗИНГ
    static TextView Lmes4Z;
    static TextView Lmes6Z;
    static TextView Lmes12Z;
    static TextView Lmes20Z;
    static TextView Lmes24Z;

    static TextView Lmes4M;
    static TextView Lmes6M;
    static TextView Lmes12M;
    static TextView Lmes20M;
    static TextView Lmes24M;

    //ЕЖЕМЕСЯЧНЫЕ ДОБРОБЫТ
    static TextView Lmes4EZ;
    static TextView Lmes6EZ;
    static TextView Lmes12EZ;
    static TextView Lmes20EZ;
    static TextView Lmes24EZ;

    static TextView Lmes4EM;
    static TextView Lmes6EM;
    static TextView Lmes12EM;
    static TextView Lmes20EM;
    static TextView Lmes24EM;

    static TextView textPrepaid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank);

        //АЛЬФАБАНК
        Ames6Z = findViewById(R.id.Ames6Z);
        Ames10Z = findViewById(R.id.Ames10Z);
        Ames12Z = findViewById(R.id.Ames12Z);
        Ames15Z = findViewById(R.id.Ames15Z);
        Ames18Z = findViewById(R.id.Ames18Z);
        Ames24Z = findViewById(R.id.Ames24Z);
        Ames36Z = findViewById(R.id.Ames36Z);

        Ames6M = findViewById(R.id.Ames6M);
        Ames10M = findViewById(R.id.Ames10M);
        Ames12M = findViewById(R.id.Ames12M);
        Ames15M = findViewById(R.id.Ames15M);
        Ames18M = findViewById(R.id.Ames18M);
        Ames24M = findViewById(R.id.Ames24M);
        Ames36M = findViewById(R.id.Ames36M);

        //ЕЖЕМЕСЯЧНЫЕ АЛЬФАБАНК
        Ames6EZ = findViewById(R.id.Ames6EZ);
        Ames10EZ = findViewById(R.id.Ames10EZ);
        Ames12EZ = findViewById(R.id.Ames12EZ);
        Ames15EZ = findViewById(R.id.Ames15EZ);
        Ames18EZ = findViewById(R.id.Ames18EZ);
        Ames24EZ = findViewById(R.id.Ames24EZ);
        Ames36EZ = findViewById(R.id.Ames36EZ);

        Ames6EM = findViewById(R.id.Ames6EM);
        Ames10EM = findViewById(R.id.Ames10EM);
        Ames12EM = findViewById(R.id.Ames12EM);
        Ames15EM = findViewById(R.id.Ames15EM);
        Ames18EM = findViewById(R.id.Ames18EM);
        Ames24EM = findViewById(R.id.Ames24EM);
        Ames36EM = findViewById(R.id.Ames36EM);

        //ДОБРОБЫТ
        Dmes3Z = findViewById(R.id.Dmes3Z);
        Dmes6Z = findViewById(R.id.Dmes6Z);
        Dmes12Z = findViewById(R.id.Dmes12Z);
        Dmes18Z = findViewById(R.id.Dmes18Z);
        Dmes24Z = findViewById(R.id.Dmes24Z);
        Dmes36Z = findViewById(R.id.Dmes36Z);

        Dmes3M = findViewById(R.id.Dmes3M);
        Dmes6M = findViewById(R.id.Dmes6M);
        Dmes12M = findViewById(R.id.Dmes12M);
        Dmes18M = findViewById(R.id.Dmes18M);
        Dmes24M = findViewById(R.id.Dmes24M);
        Dmes36M = findViewById(R.id.Dmes36M);

        //ЕЖЕМЕСЯЧНЫЕ ДОБРОБЫТ
        Dmes3EZ = findViewById(R.id.Dmes3EZ);
        Dmes6EZ = findViewById(R.id.Dmes6EZ);
        Dmes12EZ = findViewById(R.id.Dmes12EZ);
        Dmes18EZ = findViewById(R.id.Dmes18EZ);
        Dmes24EZ = findViewById(R.id.Dmes24EZ);
        Dmes36EZ = findViewById(R.id.Dmes36EZ);

        Dmes3EM = findViewById(R.id.Dmes3EM);
        Dmes6EM = findViewById(R.id.Dmes6EM);
        Dmes12EM = findViewById(R.id.Dmes12EM);
        Dmes18EM = findViewById(R.id.Dmes18EM);
        Dmes24EM = findViewById(R.id.Dmes24EM);
        Dmes36EM = findViewById(R.id.Dmes36EM);

        //ЛИЗИНГ
        Lmes4Z = findViewById(R.id.Lmes4Z);
        Lmes6Z = findViewById(R.id.Lmes6Z);
        Lmes12Z = findViewById(R.id.Lmes12Z);
        Lmes20Z = findViewById(R.id.Lmes20Z);
        Lmes24Z = findViewById(R.id.Lmes24Z);


        Lmes4M = findViewById(R.id.Lmes4M);
        Lmes6M = findViewById(R.id.Lmes6M);
        Lmes12M = findViewById(R.id.Lmes12M);
        Lmes20M = findViewById(R.id.Lmes20M);
        Lmes24M = findViewById(R.id.Lmes24M);

        //ЕЖЕМЕСЯЧНЫЕ ДОБРОБЫТ
        Lmes4EZ = findViewById(R.id.Lmes4EZ);
        Lmes6EZ = findViewById(R.id.Lmes6EZ);
        Lmes12EZ = findViewById(R.id.Lmes12EZ);
        Lmes20EZ = findViewById(R.id.Lmes20EZ);
        Lmes24EZ = findViewById(R.id.Lmes24EZ);

        Lmes4EM = findViewById(R.id.Lmes4EM);
        Lmes6EM = findViewById(R.id.Lmes6EM);
        Lmes12EM = findViewById(R.id.Lmes12EM);
        Lmes20EM = findViewById(R.id.Lmes20EM);
        Lmes24EM = findViewById(R.id.Lmes24EM);

        textPrepaid= findViewById(R.id.txtPrepaid);

        final EditText editTextPrepaid = findViewById(R.id.editTextPrepaid);
        ImageView imInfoBank = findViewById(R.id.imInfoBank);

        setPriceBank();

        //Если нажали на поле предоплаты
        imInfoBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder;
                builder = new AlertDialog.Builder(Bank.this);
                builder.setTitle("Внимание!");
                builder.setMessage(
                        "МИНИМАЛЬНАЯ сумма для ПОДАЧИ заявки: \n"
                        + "По банкам: 50 руб\n"
                        + "По лизингу: 600 руб\n" +
                        "МАКСИМАЛЬНАЯ сумма ПРЕДОПЛАТЫ по ЛИЗИНГУ: \n"
                        + "ЖЕЛ: " + prepaidLizZh + "\n"
                        + "МИН: " + prepaidLizM + "\n");

                builder.setPositiveButton("ОК", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

        //Если нажали выбрать
        editTextPrepaid.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if(event.getAction() == KeyEvent.ACTION_DOWN && (keyCode == KeyEvent.KEYCODE_ENTER)) {

                    if (editTextPrepaid.getText().toString().equals("")) {

                    }
                    // сохраняем текст, введённый до нажатия Enter в переменную
                    else {
                        String prepaid = editTextPrepaid.getText().toString();
                        textPrepaid.setText(prepaid);
                        editTextPrepaid.getText().clear();
                        setPriceBank(Integer.parseInt(prepaid));
                    }
                    return true;
                }
                return false;
            }
        }
        );

    }
    static public void setPriceZM(double z, double m) {
        priceZ = (int) z;
        priceM = (int) m;
    }

    public void setPriceBank() {

        Ames6Z.setText(minBank <= Math.ceil(priceZ * 1.06) ? (int) Math.ceil(priceZ * 1.06) + rub : "-");
        Ames10Z.setText(minBank <= Math.ceil(priceZ * 1.08) ? (int) Math.ceil(priceZ * 1.08) + rub : "-");
        Ames12Z.setText(minBank <= Math.ceil(priceZ * 1.09) ? (int) Math.ceil(priceZ * 1.09) + rub : "-");
        Ames15Z.setText(minBank <= Math.ceil(priceZ * 1.1) ? (int) Math.ceil(priceZ * 1.1) + rub : "-");
        Ames18Z.setText(minBank <= Math.ceil(priceZ * 1.135) ? (int) Math.ceil(priceZ * 1.135) + rub : "-");
        Ames24Z.setText(minBank <= Math.ceil(priceZ * 1.163) ? (int) Math.ceil(priceZ * 1.163) + rub : "-");
        Ames36Z.setText(minBank <= Math.ceil(priceZ * 1.24) ? (int) Math.ceil(priceZ * 1.24) + rub : "-");

        Ames6M.setText(minBank <= Math.ceil(priceM * 1.06) ? (int) Math.ceil(priceM * 1.06) + rub : "-");
        Ames10M.setText(minBank <= Math.ceil(priceM * 1.08) ? (int) Math.ceil(priceM * 1.08) + rub : "-");
        Ames12M.setText(minBank <= Math.ceil(priceM * 1.09) ? (int) Math.ceil(priceM * 1.09) + rub : "-");
        Ames15M.setText(minBank <= Math.ceil(priceM * 1.1) ? (int) Math.ceil(priceM * 1.1) + rub : "-");
        Ames18M.setText(minBank <= Math.ceil(priceM * 1.135) ? (int) Math.ceil(priceM * 1.135) + rub : "-");
        Ames24M.setText(minBank <= Math.ceil(priceM * 1.163) ? (int) Math.ceil(priceM * 1.163) + rub : "-");
        Ames36M.setText(minBank <= Math.ceil(priceM * 1.24) ? (int) Math.ceil(priceM * 1.24) + rub : "-");

        Ames6EZ.setText(minBank <= Math.ceil(priceZ * 1.06) ? (int) (priceZ * 1.06 * 1.044 / 6) + rub : "-");
        Ames10EZ.setText(minBank <= Math.ceil(priceZ * 1.08) ? (int) (priceZ * 1.08 * 1.06 / 10) + rub : "-");
        Ames12EZ.setText(minBank <= Math.ceil(priceZ * 1.09) ? (int) (priceZ * 1.09 * 1.0731 / 12) + rub : "-");
        Ames15EZ.setText(minBank <= Math.ceil(priceZ * 1.1) ? (int) (priceZ * 1.1 * 1.09 / 15) + rub : "-");
        Ames18EZ.setText(minBank <= Math.ceil(priceZ * 1.135) ? (int) (priceZ * 1.135 * 1.11 / 18) + rub : "-");
        Ames24EZ.setText(minBank <= Math.ceil(priceZ * 1.163) ? (int) (priceZ * 1.163 * 1.14 / 24) + rub : "-");
        Ames36EZ.setText(minBank <= Math.ceil(priceZ * 1.24) ? (int) (priceZ * 1.24 * 1.22 / 36) + rub : "-");

        Ames6EM.setText(minBank <= Math.ceil(priceM * 1.06) ? (int) (priceZ * 1.06 * 1.044 / 6) + rub : "-");
        Ames10EM.setText(minBank <= Math.ceil(priceM * 1.08) ? (int) (priceZ * 1.08 * 1.06 / 10) + rub : "-");
        Ames12EM.setText(minBank <= Math.ceil(priceM * 1.09) ? (int) (priceZ * 1.09 * 1.0731 / 12) + rub : "-");
        Ames15EM.setText(minBank <= Math.ceil(priceM * 1.1) ? (int) (priceZ * 1.1 * 1.09 / 15) + rub : "-");
        Ames18EM.setText(minBank <= Math.ceil(priceM * 1.135) ? (int) (priceM * 1.135 * 1.11 / 18) + rub : "-");
        Ames24EM.setText(minBank <= Math.ceil(priceM * 1.163) ? (int) (priceM * 1.163 * 1.14 / 24) + rub : "-");
        Ames36EM.setText(minBank <= Math.ceil(priceM * 1.24) ? (int) (priceM * 1.24 * 1.22 / 36) + rub : "-");

        //ДОБРОБЫТ
        Dmes3Z.setText(minBank <= Math.ceil(priceZ * 1.042) ? (int) Math.ceil(priceZ * 1.042) + rub : "-");
        Dmes6Z.setText(minBank <= Math.ceil(priceZ * 1.064) ? (int) Math.ceil(priceZ * 1.064) + rub : "-");
        Dmes12Z.setText(minBank <= Math.ceil(priceZ * 1.118) ? (int) Math.ceil(priceZ * 1.118) + rub : "-");
        Dmes18Z.setText(minBank <= Math.ceil(priceZ * 1.177) ? (int) Math.ceil(priceZ * 1.177) + rub : "-");
        Dmes24Z.setText(minBank <= Math.ceil(priceZ * 1.227) ? (int) Math.ceil(priceZ * 1.227) + rub : "-");
        Dmes36Z.setText(minBank <= Math.ceil(priceZ * 1.334) ? (int) Math.ceil(priceZ * 1.334) + rub : "-");

        Dmes3M.setText(minBank <= Math.ceil(priceM * 1.042) ? (int) Math.ceil(priceM * 1.042) + rub : "-");
        Dmes6M.setText(minBank <= Math.ceil(priceM * 1.064) ? (int) Math.ceil(priceM * 1.064) + rub : "-");
        Dmes12M.setText(minBank <= Math.ceil(priceM * 1.118) ? (int) Math.ceil(priceM * 1.118) + rub : "-");
        Dmes18M.setText(minBank <= Math.ceil(priceM * 1.177) ? (int) Math.ceil(priceM * 1.177) + rub : "-");
        Dmes24M.setText(minBank <= Math.ceil(priceM * 1.227) ? (int) Math.ceil(priceM * 1.227) + rub : "-");
        Dmes36M.setText(minBank <= Math.ceil(priceM * 1.334) ? (int) Math.ceil(priceM * 1.334) + rub : "-");

        Dmes3EZ.setText(minBank <= Math.ceil(priceZ * 1.042) ? (int) Math.ceil(priceZ * 1.042)/3 + rub : "-");
        Dmes6EZ.setText(minBank <= Math.ceil(priceZ * 1.064) ? (int) Math.ceil(priceZ * 1.116)/6 + rub : "-");
        Dmes12EZ.setText(minBank <= Math.ceil(priceZ * 1.118) ? (int) Math.ceil(priceZ * 1.212)/12 + rub : "-");
        Dmes18EZ.setText(minBank <= Math.ceil(priceZ * 1.177) ? (int) Math.ceil(priceZ * 1.314)/18 + rub : "-");
        Dmes24EZ.setText(minBank <= Math.ceil(priceZ * 1.227) ? (int) Math.ceil(priceZ * 1.416)/24 + rub : "-");
        Dmes36EZ.setText(minBank <= Math.ceil(priceZ * 1.334) ? (int) Math.ceil(priceZ * 1.656)/36 + rub : "-");

        Dmes3EM.setText(minBank <= Math.ceil(priceM * 1.042) ? (int) Math.ceil(priceM * 1.042)/3 + rub : "-");
        Dmes6EM.setText(minBank <= Math.ceil(priceM * 1.064) ? (int) Math.ceil(priceM * 1.116)/6 + rub : "-");
        Dmes12EM.setText(minBank <= Math.ceil(priceM * 1.118) ? (int) Math.ceil(priceM * 1.212)/12 + rub : "-");
        Dmes18EM.setText(minBank <= Math.ceil(priceM * 1.177) ? (int) Math.ceil(priceM * 1.314)/18 + rub : "-");
        Dmes24EM.setText(minBank <= Math.ceil(priceM * 1.227) ? (int) Math.ceil(priceM * 1.416)/24 + rub : "-");
        Dmes36EM.setText(minBank <= Math.ceil(priceM * 1.334) ? (int) Math.ceil(priceM * 1.656)/36 + rub : "-");


        //ЛИЗИНГ
        Lmes4Z.setText(minLiz <= Math.ceil(priceLizZh * DopPrices.LIZING4M) ? (int) Math.ceil(priceLizZh * DopPrices.LIZING4M) + rub : "-");
        Lmes6Z.setText(minLiz <= Math.ceil(priceLizZh * DopPrices.LIZING6M) ? (int) Math.ceil(priceLizZh * DopPrices.LIZING6M) + rub : "-");
        Lmes12Z.setText(minLiz <= Math.ceil(priceLizZh * DopPrices.LIZING12M) ? (int) Math.ceil(priceLizZh * DopPrices.LIZING12M) + rub : "-");
        Lmes20Z.setText(minLiz <= Math.ceil(priceLizZh * DopPrices.LIZING20M) ? (int) Math.ceil(priceLizZh * DopPrices.LIZING20M) + rub : "-");
        Lmes24Z.setText(minLiz <= Math.ceil(priceLizZh * DopPrices.LIZING24M) ? (int) Math.ceil(priceLizZh * DopPrices.LIZING24M) + rub : "-");

        Lmes4M.setText(minLiz <= Math.ceil(priceLizM * DopPrices.LIZING4M) ? (int) Math.ceil(priceLizM * DopPrices.LIZING4M) + rub : "-");
        Lmes6M.setText(minLiz <= Math.ceil(priceLizM * DopPrices.LIZING6M) ? (int) Math.ceil(priceLizM * DopPrices.LIZING6M) + rub : "-");
        Lmes12M.setText(minLiz <= Math.ceil(priceLizM * DopPrices.LIZING12M) ? (int) Math.ceil(priceLizM * DopPrices.LIZING12M) + rub : "-");
        Lmes20M.setText(minLiz <= Math.ceil(priceLizM * DopPrices.LIZING20M) ? (int) Math.ceil(priceLizM * DopPrices.LIZING20M) + rub : "-");
        Lmes24M.setText(minLiz <= Math.ceil(priceLizM * DopPrices.LIZING24M) ? (int) Math.ceil(priceLizM * DopPrices.LIZING24M) + rub : "-");


        Lmes4EZ.setText(minLiz <= Math.ceil(priceLizZh * DopPrices.LIZING4M) ? (int) Math.ceil(priceLizZh * DopPrices.LIZING4M)/4 + rub : "-");
        Lmes6EZ.setText(minLiz <= Math.ceil(priceLizZh * DopPrices.LIZING6M) ? (int) Math.ceil(priceLizZh * DopPrices.LIZING6M)/6 + rub : "-");
        Lmes12EZ.setText(minLiz <= Math.ceil(priceLizZh * DopPrices.LIZING12M) ? (int) Math.ceil(priceLizZh * DopPrices.LIZING12M)/12 + rub : "-");
        Lmes20EZ.setText(minLiz <= Math.ceil(priceLizZh * DopPrices.LIZING20M) ? (int) Math.ceil(priceLizZh * DopPrices.LIZING20M)/20 + rub : "-");
        Lmes24EZ.setText(minLiz <= Math.ceil(priceLizZh * DopPrices.LIZING24M) ? (int) Math.ceil(priceLizZh * DopPrices.LIZING24M)/24 + rub : "-");

        Lmes4EM.setText(minLiz <= Math.ceil(priceLizM * DopPrices.LIZING4M) ? (int) Math.ceil(priceLizM * DopPrices.LIZING4M)/4 + rub : "-");
        Lmes6EM.setText(minLiz <= Math.ceil(priceLizM * DopPrices.LIZING6M) ? (int) Math.ceil(priceLizM * DopPrices.LIZING6M)/6 + rub : "-");
        Lmes12EM.setText(minLiz <= Math.ceil(priceLizM * DopPrices.LIZING12M) ? (int) Math.ceil(priceLizM * DopPrices.LIZING12M)/12 + rub : "-");
        Lmes20EM.setText(minLiz <= Math.ceil(priceLizM * DopPrices.LIZING20M) ? (int) Math.ceil(priceLizM * DopPrices.LIZING20M)/20 + rub : "-");
        Lmes24EM.setText(minLiz <= Math.ceil(priceLizM * DopPrices.LIZING24M) ? (int) Math.ceil(priceLizM * DopPrices.LIZING24M)/24 + rub : "-");
    }

    //Вызывается при добовлении предоплаты
    public void setPriceBank(int i) {
        int tmpPriceZ = priceZ - i;
        int tmpPriceM = priceM - i;
        ContinePrice.forLizingFromBank(i);


        Ames6Z.setText(minBank <= Math.ceil(tmpPriceZ * 1.06) ? (int) Math.ceil(tmpPriceZ * 1.06) + rub : "-");
        Ames10Z.setText(minBank <= Math.ceil(tmpPriceZ * 1.08) ? (int) Math.ceil(tmpPriceZ * 1.08) + rub : "-");
        Ames12Z.setText(minBank <= Math.ceil(tmpPriceZ * 1.09) ? (int) Math.ceil(tmpPriceZ * 1.09) + rub : "-");
        Ames15Z.setText(minBank <= Math.ceil(tmpPriceZ * 1.1) ? (int) Math.ceil(tmpPriceZ * 1.1) + rub : "-");
        Ames18Z.setText(minBank <= Math.ceil(tmpPriceZ * 1.135) ? (int) Math.ceil(tmpPriceZ * 1.135) + rub : "-");
        Ames24Z.setText(minBank <= Math.ceil(tmpPriceZ * 1.163) ? (int) Math.ceil(tmpPriceZ * 1.163) + rub : "-");
        Ames36Z.setText(minBank <= Math.ceil(tmpPriceZ * 1.24) ? (int) Math.ceil(tmpPriceZ * 1.24) + rub : "-");

        Ames6M.setText(minBank <= Math.ceil(tmpPriceM * 1.06) ? (int) Math.ceil(tmpPriceM * 1.06) + rub : "-");
        Ames10M.setText(minBank <= Math.ceil(tmpPriceM * 1.08) ? (int) Math.ceil(tmpPriceM * 1.08) + rub : "-");
        Ames12M.setText(minBank <= Math.ceil(tmpPriceM * 1.09) ? (int) Math.ceil(tmpPriceM * 1.09) + rub : "-");
        Ames15M.setText(minBank <= Math.ceil(tmpPriceM * 1.1) ? (int) Math.ceil(tmpPriceM * 1.1) + rub : "-");
        Ames18M.setText(minBank <= Math.ceil(tmpPriceM * 1.135) ? (int) Math.ceil(tmpPriceM * 1.135) + rub : "-");
        Ames24M.setText(minBank <= Math.ceil(tmpPriceM * 1.163) ? (int) Math.ceil(tmpPriceM * 1.163) + rub : "-");
        Ames36M.setText(minBank <= Math.ceil(tmpPriceM * 1.24) ? (int) Math.ceil(tmpPriceM * 1.24) + rub : "-");

        Ames6EZ.setText(minBank <= Math.ceil(tmpPriceZ * 1.06) ? (int) (tmpPriceZ * 1.104 / 6) + rub : "-");
        Ames10EZ.setText(minBank <= Math.ceil(tmpPriceZ * 1.08) ? (int) (tmpPriceZ * 1.15 / 10) + rub : "-");
        Ames12EZ.setText(minBank <= Math.ceil(tmpPriceZ * 1.09) ? (int) (tmpPriceZ * 1.176 / 12) + rub : "-");
        Ames15EZ.setText(minBank <= Math.ceil(tmpPriceZ * 1.1) ? (int) (tmpPriceZ * 1.20 / 15) + rub : "-");
        Ames18EZ.setText(minBank <= Math.ceil(tmpPriceZ * 1.135) ? (int) (tmpPriceZ * 1.26 / 18) + rub : "-");
        Ames24EZ.setText(minBank <= Math.ceil(tmpPriceZ * 1.163) ? (int) (tmpPriceZ * 1.344 / 24) + rub : "-");
        Ames36EZ.setText(minBank <= Math.ceil(tmpPriceZ * 1.24) ? (int) (tmpPriceZ * 1.512 / 36) + rub : "-");

        Ames6EM.setText(minBank <= Math.ceil(tmpPriceM * 1.06) ? (int) (tmpPriceM * 1.104 / 6) + rub : "-");
        Ames10EM.setText(minBank <= Math.ceil(tmpPriceM * 1.08) ? (int) (tmpPriceM * 1.15 / 10) + rub : "-");
        Ames12EM.setText(minBank <= Math.ceil(tmpPriceM * 1.09) ? (int) (tmpPriceM * 1.176 / 12) + rub : "-");
        Ames15EM.setText(minBank <= Math.ceil(tmpPriceM * 1.1) ? (int) (tmpPriceM * 1.20 / 15) + rub : "-");
        Ames18EM.setText(minBank <= Math.ceil(tmpPriceM * 1.135) ? (int) (tmpPriceM * 1.26 / 18) + rub : "-");
        Ames24EM.setText(minBank <= Math.ceil(tmpPriceM * 1.163) ? (int) (tmpPriceM * 1.344 / 24) + rub : "-");
        Ames36EM.setText(minBank <= Math.ceil(tmpPriceM * 1.24) ? (int) (tmpPriceM * 1.512 / 36) + rub : "-");

        //ДОБРОБЫТ
        Dmes3Z.setText(minBank <= Math.ceil(tmpPriceZ * 1.042) ? (int) Math.ceil(tmpPriceZ * 1.042) + rub : "-");
        Dmes6Z.setText(minBank <= Math.ceil(tmpPriceZ * 1.064) ? (int) Math.ceil(tmpPriceZ * 1.064) + rub : "-");
        Dmes12Z.setText(minBank <= Math.ceil(tmpPriceZ * 1.118) ? (int) Math.ceil(tmpPriceZ * 1.118) + rub : "-");
        Dmes18Z.setText(minBank <= Math.ceil(tmpPriceZ * 1.177) ? (int) Math.ceil(tmpPriceZ * 1.177) + rub : "-");
        Dmes24Z.setText(minBank <= Math.ceil(tmpPriceZ * 1.227) ? (int) Math.ceil(tmpPriceZ * 1.227) + rub : "-");
        Dmes36Z.setText(minBank <= Math.ceil(tmpPriceZ * 1.334) ? (int) Math.ceil(tmpPriceZ * 1.334) + rub : "-");

        Dmes3M.setText(minBank <= Math.ceil(tmpPriceM * 1.042) ? (int) Math.ceil(tmpPriceM * 1.042) + rub : "-");
        Dmes6M.setText(minBank <= Math.ceil(tmpPriceM * 1.064) ? (int) Math.ceil(tmpPriceM * 1.064) + rub : "-");
        Dmes12M.setText(minBank <= Math.ceil(tmpPriceM * 1.118) ? (int) Math.ceil(tmpPriceM * 1.118) + rub : "-");
        Dmes18M.setText(minBank <= Math.ceil(tmpPriceM * 1.177) ? (int) Math.ceil(tmpPriceM * 1.177) + rub : "-");
        Dmes24M.setText(minBank <= Math.ceil(tmpPriceM * 1.227) ? (int) Math.ceil(tmpPriceM * 1.227) + rub : "-");
        Dmes36M.setText(minBank <= Math.ceil(tmpPriceM * 1.334) ? (int) Math.ceil(tmpPriceM * 1.334) + rub : "-");

        Dmes3EZ.setText(minBank <= Math.ceil(tmpPriceZ * 1.042) ? (int) Math.ceil(tmpPriceZ * 1.042)/3 + rub : "-");
        Dmes6EZ.setText(minBank <= Math.ceil(tmpPriceZ * 1.064) ? (int) Math.ceil(tmpPriceZ * 1.116)/6 + rub : "-");
        Dmes12EZ.setText(minBank <= Math.ceil(tmpPriceZ * 1.118) ? (int) Math.ceil(tmpPriceZ * 1.212)/12 + rub : "-");
        Dmes18EZ.setText(minBank <= Math.ceil(tmpPriceZ * 1.177) ? (int) Math.ceil(tmpPriceZ * 1.314)/18 + rub : "-");
        Dmes24EZ.setText(minBank <= Math.ceil(tmpPriceZ * 1.227) ? (int) Math.ceil(tmpPriceZ * 1.416)/24 + rub : "-");
        Dmes36EZ.setText(minBank <= Math.ceil(tmpPriceZ * 1.334) ? (int) Math.ceil(tmpPriceZ * 1.656)/36 + rub : "-");

        Dmes3EM.setText(minBank <= Math.ceil(tmpPriceM * 1.042) ? (int) Math.ceil(tmpPriceM * 1.042)/3 + rub : "-");
        Dmes6EM.setText(minBank <= Math.ceil(tmpPriceM * 1.064) ? (int) Math.ceil(tmpPriceM * 1.116)/6 + rub : "-");
        Dmes12EM.setText(minBank <= Math.ceil(tmpPriceM * 1.118) ? (int) Math.ceil(tmpPriceM * 1.212)/12 + rub : "-");
        Dmes18EM.setText(minBank <= Math.ceil(tmpPriceM * 1.177) ? (int) Math.ceil(tmpPriceM * 1.314)/18 + rub : "-");
        Dmes24EM.setText(minBank <= Math.ceil(tmpPriceM * 1.227) ? (int) Math.ceil(tmpPriceM * 1.416)/24 + rub : "-");
        Dmes36EM.setText(minBank <= Math.ceil(tmpPriceM * 1.334) ? (int) Math.ceil(tmpPriceM * 1.656)/36 + rub : "-");


        //ЛИЗИНГ
        Lmes4Z.setText(minLiz <= Math.ceil(priceLizZhWPrepaid * DopPrices.LIZING4M) && i <= prepaidLizZh ? (int) Math.ceil(priceLizZhWPrepaid * DopPrices.LIZING4M) + rub : "-");
        Lmes6Z.setText(minLiz <= Math.ceil(priceLizZhWPrepaid * DopPrices.LIZING6M) && i <= prepaidLizZh ? (int) Math.ceil(priceLizZhWPrepaid * DopPrices.LIZING6M) + rub : "-");
        Lmes12Z.setText(minLiz <= Math.ceil(priceLizZhWPrepaid * DopPrices.LIZING12M) && i <= prepaidLizZh ? (int) Math.ceil(priceLizZhWPrepaid * DopPrices.LIZING12M) + rub : "-");
        Lmes20Z.setText(minLiz <= Math.ceil(priceLizZhWPrepaid * DopPrices.LIZING20M) && i <= prepaidLizZh ? (int) Math.ceil(priceLizZhWPrepaid * DopPrices.LIZING20M) + rub : "-");
        Lmes24Z.setText(minLiz <= Math.ceil(priceLizZhWPrepaid * DopPrices.LIZING24M) && i <= prepaidLizZh ? (int) Math.ceil(priceLizZhWPrepaid * DopPrices.LIZING24M) + rub : "-");

        Lmes4M.setText(minLiz  <= Math.ceil(priceLizMWPrepaid  * DopPrices.LIZING4M) && i <= prepaidLizM ? (int) Math.ceil(priceLizMWPrepaid  * DopPrices.LIZING4M) + rub : "-");
        Lmes6M.setText(minLiz  <= Math.ceil(priceLizMWPrepaid  * DopPrices.LIZING6M) && i <= prepaidLizM ? (int) Math.ceil(priceLizMWPrepaid  * DopPrices.LIZING6M) + rub : "-");
        Lmes12M.setText(minLiz  <= Math.ceil(priceLizMWPrepaid  * DopPrices.LIZING12M) && i <= prepaidLizM ? (int) Math.ceil(priceLizMWPrepaid  * DopPrices.LIZING12M) + rub : "-");
        Lmes20M.setText(minLiz  <= Math.ceil(priceLizMWPrepaid  * DopPrices.LIZING20M) && i <= prepaidLizM ? (int) Math.ceil(priceLizMWPrepaid  * DopPrices.LIZING20M) + rub : "-");
        Lmes24M.setText(minLiz  <= Math.ceil(priceLizMWPrepaid  * DopPrices.LIZING24M) && i <= prepaidLizM ? (int) Math.ceil(priceLizMWPrepaid  * DopPrices.LIZING24M) + rub : "-");


        Lmes4EZ.setText(minLiz <= Math.ceil(priceLizZhWPrepaid * DopPrices.LIZING4M) && i <= prepaidLizZh ? (int) Math.ceil(priceLizZhWPrepaid * DopPrices.LIZING4M)/4 + rub : "-");
        Lmes6EZ.setText(minLiz <= Math.ceil(priceLizZhWPrepaid * DopPrices.LIZING6M) && i <= prepaidLizZh ? (int) Math.ceil(priceLizZhWPrepaid * DopPrices.LIZING6M)/6 + rub : "-");
        Lmes12EZ.setText(minLiz <= Math.ceil(priceLizZhWPrepaid * DopPrices.LIZING12M) && i <= prepaidLizZh ? (int) Math.ceil(priceLizZhWPrepaid * DopPrices.LIZING12M)/12 + rub : "-");
        Lmes20EZ.setText(minLiz <= Math.ceil(priceLizZhWPrepaid * DopPrices.LIZING20M) && i <= prepaidLizZh ? (int) Math.ceil(priceLizZhWPrepaid * DopPrices.LIZING20M)/20 + rub : "-");
        Lmes24EZ.setText(minLiz <= Math.ceil(priceLizZhWPrepaid * DopPrices.LIZING24M) && i <= prepaidLizZh ? (int) Math.ceil(priceLizZhWPrepaid * DopPrices.LIZING24M)/24 + rub : "-");

        Lmes4EM.setText(minLiz <= Math.ceil(priceLizMWPrepaid  * DopPrices.LIZING4M) && i <= prepaidLizM ? (int) Math.ceil(priceLizMWPrepaid  * DopPrices.LIZING4M)/4 + rub : "-");
        Lmes6EM.setText(minLiz  <= Math.ceil(priceLizMWPrepaid  * DopPrices.LIZING6M) && i <= prepaidLizM ? (int) Math.ceil(priceLizMWPrepaid  * DopPrices.LIZING6M)/6 + rub : "-");
        Lmes12EM.setText(minLiz  <= Math.ceil(priceLizMWPrepaid  * DopPrices.LIZING12M) && i <= prepaidLizM ? (int) Math.ceil(priceLizMWPrepaid  * DopPrices.LIZING12M)/12 + rub : "-");
        Lmes20EM.setText(minLiz  <= Math.ceil(priceLizMWPrepaid  * DopPrices.LIZING20M) && i <= prepaidLizM ? (int) Math.ceil(priceLizMWPrepaid  * DopPrices.LIZING20M)/20 + rub : "-");
        Lmes24EM.setText(minLiz  <= Math.ceil(priceLizMWPrepaid  * DopPrices.LIZING24M)  && i <= prepaidLizM? (int) Math.ceil(priceLizMWPrepaid  * DopPrices.LIZING24M)/24 + rub : "-");
    }

    public static void setPriceDopAndItem(double pLizZh, double pLizMin, double zhMaxPrepaid, double minMaxPrepaid) {
        priceLizZh = pLizZh;
        priceLizM = pLizMin;
        prepaidLizZh = (int) zhMaxPrepaid;
        prepaidLizM = (int) minMaxPrepaid;
    }


    //Вызывается при добовлении предоплаты
    public static void setPriceLizWithPrepaid(double pLizZh, double pLizMin) {
        priceLizZhWPrepaid = pLizZh;
        priceLizMWPrepaid = pLizMin;
    }

}
