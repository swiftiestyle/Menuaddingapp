package com.example.buddies.menuaddingapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
EditText link;
TextView text;
Button submit,upload,show;
String s;
static String arr [] = new String[100000];
int i =0,j=0;
DatabaseReference db ;
JSONParser obj = new JSONParser();
MyDataModel model = new MyDataModel();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        link=(EditText)findViewById(R.id.editText);
        submit=(Button)findViewById(R.id.button2);
        upload=(Button)findViewById(R.id.button3);

        db= FirebaseDatabase.getInstance().getReference().child("Restaurants");
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s= link.getText().toString();

                obj.link(s);
                new GetDataTask().execute();

            }
        });



        upload.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

        for(j=0;j< model.length();j++){
    if (model.getmRType(j).equals("R") ) {
        if (model.getmCategory(j).equals("Classic Chicken") )
        {
        if(model.getmSubCategory(j).equals("Crunchy Masala"))
        {
            DatabaseReference db1 = db.child("Restaurant").child("Five star chicken").child("Menu").child("Classic Chicken").child("Crunchy Masala");
           DatabaseReference db2 = db1.push();
        db2.child("itemQty").setValue(model.getItemQty(j));
        db2.child("mCategory").setValue(model.getmCategory(j));
        db2.child("mDiscount").setValue(model.getmDiscount(j));
            db2.child("mItemDescription").setValue(model.getmItemDescription(j));
            db2.child("mItemName").setValue(model.getmItemName(j));
            db2.child("mItemPrice").setValue(model.getmItemPrice(j));
            db2.child("mItemStock").setValue(model.getmItemStock(j));
            db2.child("mItemType").setValue(model.getmItemType(j));
            db2.child("mSubCategory").setValue(model.getmSubCategory(j));
            db2.child("mRType").setValue(model.getmRType(j));


        }
        else if(model.getmSubCategory(j).equals("Hot N'Smokey"))
            {
            DatabaseReference db1 = db.child("Restaurant").child("Five star chicken").child("Menu").child("Classic Chicken").child("Hot N'Smokey");
            DatabaseReference db2 = db1.push();
            db2.child("itemQty").setValue(model.getItemQty(j));
            db2.child("mCategory").setValue(model.getmCategory(j));
            db2.child("mDiscount").setValue(model.getmDiscount(j));
            db2.child("mItemDescription").setValue(model.getmItemDescription(j));
            db2.child("mItemName").setValue(model.getmItemName(j));
            db2.child("mItemPrice").setValue(model.getmItemPrice(j));
            db2.child("mItemStock").setValue(model.getmItemStock(j));
            db2.child("mItemType").setValue(model.getmItemType(j));
            db2.child("mSubCategory").setValue(model.getmSubCategory(j));
            db2.child("mRType").setValue(model.getmRType(j));

        }
        else {
            if (model.getmSubCategory(j).equals("Null")) {
                DatabaseReference db1 = db.child("Restaurant").child("Five star chicken").child("Menu").child("Classic Chicken");
                DatabaseReference db2 = db1.push();
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));
            } else{
                DatabaseReference db1 = db.child("Restaurant").child("Five star chicken").child("Menu").child("Classic Chicken");
            DatabaseReference db2 = db1.child("" + model.getmSubCategory(j));
            db2.child("itemQty").setValue(model.getItemQty(j));
            db2.child("mCategory").setValue(model.getmCategory(j));
            db2.child("mDiscount").setValue(model.getmDiscount(j));
            db2.child("mItemDescription").setValue(model.getmItemDescription(j));
            db2.child("mItemName").setValue(model.getmItemName(j));
            db2.child("mItemPrice").setValue(model.getmItemPrice(j));
            db2.child("mItemStock").setValue(model.getmItemStock(j));
            db2.child("mItemType").setValue(model.getmItemType(j));
            db2.child("mSubCategory").setValue(model.getmSubCategory(j));
            db2.child("mRType").setValue(model.getmRType(j));
        }

        }
        }
        else if (model.getmCategory(j).equals("Grab N'Eat") ){
            if (model.getmSubCategory(j).equals("Null")) {
                DatabaseReference db1 = db.child("Restaurant").child("Five star chicken").child("Menu").child("Grab N'Eat");
                DatabaseReference db2 = db1.push();
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));
            } else{
                DatabaseReference db1 = db.child("Restaurant").child("Five star chicken").child("Menu").child("Grab N'Eat");
                DatabaseReference db2 = db1.child("" + model.getmSubCategory(j));
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));
            }


        }
        if (model.getmCategory(j).equals("Quick Bites") ){
            if (model.getmSubCategory(j).equals("Null")) {
                DatabaseReference db1 = db.child("Restaurant").child("Five star chicken").child("Menu").child("Quick Bites");
                DatabaseReference db2 = db1.push();
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));
            } else{
                DatabaseReference db1 = db.child("Restaurant").child("Five star chicken").child("Menu").child("Quick Bites");
                DatabaseReference db2 = db1.child("" + model.getmSubCategory(j));
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));
            }

        }
        if (model.getmCategory(j).equals("Refreshers") ){
            if (model.getmSubCategory(j).equals("Null")) {
                DatabaseReference db1 = db.child("Restaurant").child("Five star chicken").child("Menu").child("Refreshers");
                DatabaseReference db2 = db1.push();
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));
            } else{
                DatabaseReference db1 = db.child("Restaurant").child("Five star chicken").child("Menu").child("Refreshers");
                DatabaseReference db2 = db1.child("" + model.getmSubCategory(j));
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));
            }

        }
        if (model.getmCategory(j).equals("Super Saver Combos") ){
            if(model.getmSubCategory(j).equals("Crunchy Masala"))
            {
                DatabaseReference db1 = db.child("Restaurant").child("Five star chicken").child("Menu").child("Super Saver Combos").child("Crunchy Masala");
                DatabaseReference db2 = db1.push();
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));


            }
            else if(model.getmSubCategory(j).equals("Hot N'Smokey"))
            {
                DatabaseReference db1 = db.child("Restaurant").child("Five star chicken").child("Menu").child("Super Saver Combos").child("Hot N'Smokey");
                DatabaseReference db2 = db1.push();
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));

            }
            else
            {
                if (model.getmSubCategory(j).equals("Null")) {
                    DatabaseReference db1 = db.child("Restaurant").child("Five star chicken").child("Menu").child("Super Saver Combos");
                    DatabaseReference db2 = db1.push();
                    db2.child("itemQty").setValue(model.getItemQty(j));
                    db2.child("mCategory").setValue(model.getmCategory(j));
                    db2.child("mDiscount").setValue(model.getmDiscount(j));
                    db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                    db2.child("mItemName").setValue(model.getmItemName(j));
                    db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                    db2.child("mItemStock").setValue(model.getmItemStock(j));
                    db2.child("mItemType").setValue(model.getmItemType(j));
                    db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                    db2.child("mRType").setValue(model.getmRType(j));
                } else{
                    DatabaseReference db1 = db.child("Restaurant").child("Five star chicken").child("Menu").child("Refreshers");
                    DatabaseReference db2 = db1.child("" + model.getmSubCategory(j));
                    db2.child("itemQty").setValue(model.getItemQty(j));
                    db2.child("mCategory").setValue(model.getmCategory(j));
                    db2.child("mDiscount").setValue(model.getmDiscount(j));
                    db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                    db2.child("mItemName").setValue(model.getmItemName(j));
                    db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                    db2.child("mItemStock").setValue(model.getmItemStock(j));
                    db2.child("mItemType").setValue(model.getmItemType(j));
                    db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                    db2.child("mRType").setValue(model.getmRType(j));
                }


            }

        }
    else{
           if(model.getmCategory(j).equals("Null"))
           {
               if (model.getmSubCategory(j).equals("Null")) {
                   DatabaseReference db1 = db.child("Restaurant").child("Five star chicken").child("Menu");
                   DatabaseReference db3 = db1.push();
                  DatabaseReference db2= db3.push();
                   db2.child("itemQty").setValue(model.getItemQty(j));
                   db2.child("mCategory").setValue(model.getmCategory(j));
                   db2.child("mDiscount").setValue(model.getmDiscount(j));
                   db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                   db2.child("mItemName").setValue(model.getmItemName(j));
                   db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                   db2.child("mItemStock").setValue(model.getmItemStock(j));
                   db2.child("mItemType").setValue(model.getmItemType(j));
                   db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                   db2.child("mRType").setValue(model.getmRType(j));
               } else{
                   DatabaseReference db1 = db.child("Restaurant").child("Five star chicken").child("Menu").push();
                   DatabaseReference db2 = db1.child("" + model.getmSubCategory(j));
                   db2.child("itemQty").setValue(model.getItemQty(j));
                   db2.child("mCategory").setValue(model.getmCategory(j));
                   db2.child("mDiscount").setValue(model.getmDiscount(j));
                   db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                   db2.child("mItemName").setValue(model.getmItemName(j));
                   db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                   db2.child("mItemStock").setValue(model.getmItemStock(j));
                   db2.child("mItemType").setValue(model.getmItemType(j));
                   db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                   db2.child("mRType").setValue(model.getmRType(j));
               }
           }

        }
    }
   else if (model.getmRType(j).equals("C") ){
        if(model.getmCategory(j).equals("Null"))
                {
                    if (model.getmSubCategory(j).equals("Null")) {
                        DatabaseReference db1 = db.child("Cafe").child("Cafe republic").child("Menu");
                        DatabaseReference db3 = db1.push();
                DatabaseReference db2= db3.push();
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));
            } else{
                DatabaseReference db1 = db.child("Cafe").child("Cafe republic").child("Menu").push();
                DatabaseReference db2 = db1.child("" + model.getmSubCategory(j));
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));
            }

        }
        else{

            if (model.getmSubCategory(j).equals("Null")) {
                DatabaseReference db1 = db.child("Cafe").child("Cafe republic").child("Menu");
                DatabaseReference db3 = db1.child(""+model.getmCategory(j));
                DatabaseReference db2= db3.push();
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));
            } else{
                DatabaseReference db1 = db.child("Cafe").child("Cafe republic").child("Menu").child(""+model.getmCategory(j));
                DatabaseReference db2 = db1.child("" + model.getmSubCategory(j));
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));
            }

        }

    }
    else if (model.getmRType(j).equals("BC") ){

        if(model.getmCategory(j).equals("Null"))
        {
            if (model.getmSubCategory(j).equals("Null")) {
                DatabaseReference db1 = db.child("Bake corners").child("Menu");
                DatabaseReference db3 = db1.push();
                DatabaseReference db2= db3.push();
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));
            } else{
                DatabaseReference db1 = db.child("Bake corners").child("Menu").push();
                DatabaseReference db2 = db1.child("" + model.getmSubCategory(j));
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));
            }

        }
        else{

            if (model.getmSubCategory(j).equals("Null")) {
                DatabaseReference db1 = db.child("Bake corners").child("Menu");
                DatabaseReference db3 = db1.child(""+model.getmCategory(j));
                DatabaseReference db2= db3.push();
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));
            } else{
                DatabaseReference db1 = db.child("Bake corners").child("Menu").child(""+model.getmCategory(j));
                DatabaseReference db2 = db1.child("" + model.getmSubCategory(j));
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));
            }

        }



    }
    else if (model.getmRType(j).equals("FF") ){
        if(model.getmCategory(j).equals("Null"))
        {
            if (model.getmSubCategory(j).equals("Null")) {
                DatabaseReference db1 = db.child("Fast food restaurants").child("Menu");
                DatabaseReference db3 = db1.push();
                DatabaseReference db2= db3.push();
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));
            } else{
                DatabaseReference db1 = db.child("Fast food restaurants").child("Menu").push();
                DatabaseReference db2 = db1.child("" + model.getmSubCategory(j));
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));
            }

        }
        else{

            if (model.getmSubCategory(j).equals("Null")) {
                DatabaseReference db1 = db.child("Fast food restaurants").child("Menu");
                DatabaseReference db3 = db1.child(""+model.getmCategory(j));
                DatabaseReference db2= db3.push();
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));
            } else{
                DatabaseReference db1 = db.child("Fast food restaurants").child("Menu").child(""+model.getmCategory(j));
                DatabaseReference db2 = db1.child("" + model.getmSubCategory(j));
                db2.child("itemQty").setValue(model.getItemQty(j));
                db2.child("mCategory").setValue(model.getmCategory(j));
                db2.child("mDiscount").setValue(model.getmDiscount(j));
                db2.child("mItemDescription").setValue(model.getmItemDescription(j));
                db2.child("mItemName").setValue(model.getmItemName(j));
                db2.child("mItemPrice").setValue(model.getmItemPrice(j));
                db2.child("mItemStock").setValue(model.getmItemStock(j));
                db2.child("mItemType").setValue(model.getmItemType(j));
                db2.child("mSubCategory").setValue(model.getmSubCategory(j));
                db2.child("mRType").setValue(model.getmRType(j));
            }

        }




    }
        }
}

});

    }
    class GetDataTask extends AsyncTask<Void,Void,Void>{
        int jIndex;
        int x;
        @Nullable
        @Override
        protected Void doInBackground(Void... params) {

            /**
             * Getting JSON Object from Web Using okHttp
             */

            JSONObject jsonObject = obj.getDataFromWeb();

            try {
                /**
                 * Check Whether Its NULL???
                 */
                if (jsonObject != null) {
                    /**
                     * Check Length...
                     */
                    if (jsonObject.length() > 0) {
                        /**
                         * Getting Array named "contacts" From MAIN Json Object
                         */
                        JSONArray array = jsonObject.getJSONArray(Keys.KEY_CONTACTS);

                        /**
                         * Check Length of Array...
                         */


                        int lenArray = array.length();
                        if (lenArray > 0) {
                            for (; jIndex < lenArray; jIndex++) {

                                /**
                                 * Creating Every time New Object
                                 * and
                                 * Adding into List
                                 */
                                MyDataModel model1 = new MyDataModel();

                                /**
                                 * Getting Inner Object from contacts array...
                                 * and
                                 * From that We will get Name of that Contact
                                 *
                                 */
                                JSONObject innerObject = array.getJSONObject(jIndex);

                                String itemQty = innerObject.getString(Keys.KEY_ITEMQTY);
                                String mCategory = innerObject.getString(Keys.KEY_CATEGORY);
                                String mDiscount = innerObject.getString(Keys.KEY_DISCOUNT);
                                String mItemDescription = innerObject.getString(Keys.KEY_DES);
                                String mItemName = innerObject.getString(Keys.KEY_NAME);
                                String mItemPrice = innerObject.getString(Keys.KEY_PRICE);
                                String mItemStock = innerObject.getString(Keys.KEY_AVAILABILITY);
                                String mItemType = innerObject.getString(Keys.KEY_TYPE);
                                String mSubCategory = innerObject.getString(Keys.KEY_SUBCATEGORY);
String mRType = innerObject.getString(Keys.KEY_RTYPE);
                                /**
                                 * Getting Object from Object "phone"
                                 */
                                //JSONObject phoneObject = innerObject.getJSONObject(Keys.KEY_PHONE);
                                //String phone = phoneObject.getString(Keys.KEY_MOBILE);

model1.setItemQty(itemQty,i);
                                model1.setmCategory(mCategory,i);

                                model1.setmDiscount(mDiscount,i);

                                model1.setmItemDescription(mItemDescription,i);

                                model1.setmItemName(mItemName,i);

                                model1.setmItemPrice(mItemPrice,i);

                                model1.setmItemStock(mItemStock,i);

                                model1.setmItemType(mItemType,i);

model1.setmRType(mRType,i);
                                model1.setmSubCategory(mSubCategory,i);
                          ++i;
                            }
                        }
                    } else {

                    }
                }
            } catch(JSONException je){
                    Log.i(JSONParser.TAG, "" + je.getLocalizedMessage());
                }
                return null;
            }}}

