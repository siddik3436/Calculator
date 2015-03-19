package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View.OnClickListener;

public class Calculator extends Activity {
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsub,bmul,bdiv,beq,clr;
		EditText et,et2;
		//int val1, val2;
		double val1,val2;
		boolean add,sub,div,mul;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gui);
		
		
			  b1=(Button) findViewById(R.id.button1);
			  b2=(Button) findViewById(R.id.button01);
			  b3=(Button) findViewById(R.id.button02);
			  b4=(Button) findViewById(R.id.button03);
			  b5=(Button) findViewById(R.id.button04);
			  b6=(Button) findViewById(R.id.button05);
			  b7=(Button) findViewById(R.id.button06);
			  b8=(Button) findViewById(R.id.button07);
			  b9=(Button) findViewById(R.id.button08);
			  b0=(Button) findViewById(R.id.button09);
			  bdot=(Button) findViewById(R.id.button10);
			  badd=(Button) findViewById(R.id.button11);
			  bsub=(Button) findViewById(R.id.button12);
			  bmul=(Button) findViewById(R.id.button13);
			  bdiv=(Button) findViewById(R.id.button14);
			  beq=(Button) findViewById(R.id.button15);
			  et=(EditText) findViewById(R.id.editText1);
			  et2=(EditText) findViewById(R.id.editText2);
			  clr=(Button)findViewById(R.id.btnClear);
		
		clr.setOnClickListener(new View.OnClickListener() {
			 	   @Override
			 	   public void onClick(View v) {
			 	    // TODO Auto-generated method stub
			 	    et.setText("0");
			 	   et2.setText(null);
			 	   }
			 	  });
		 b1.setOnClickListener(new View.OnClickListener() {
			 	   @Override
			 	   public void onClick(View v) {
			 	    // TODO Auto-generated method stub
			 	    et.setText(et.getText()+"1");
			 	   }
			 	  });
		 
			 b2.setOnClickListener(new View.OnClickListener() {
			 	   @Override
			 	   public void onClick(View v) {
			 	    // TODO Auto-generated method stub
			 	    et.setText(et.getText()+"2");
			 	   }
			 	  });
			 	  
			 b3.setOnClickListener(new View.OnClickListener() {
			 	   @Override
			 	   public void onClick(View v) {
			 	    // TODO Auto-generated method stub
			 	    et.setText(et.getText()+"3");
			 	   }
			 	  });
			 	  
			b4.setOnClickListener(new View.OnClickListener() {
			 	   @Override
			 	   public void onClick(View v) {
			 	    // TODO Auto-generated method stub
			 	    et.setText(et.getText()+"4");
			 	   }
			 	  });
			 	  
			b5.setOnClickListener(new View.OnClickListener() {
			 	   @Override
			 	   public void onClick(View v) {
			 	    // TODO Auto-generated method stub
			 	    et.setText(et.getText()+"5");
			 	   }
			 	  });
			 	  
			b6.setOnClickListener(new View.OnClickListener() {
			 	   @Override
			 	   public void onClick(View v) {
			 	    // TODO Auto-generated method stub
			 	    et.setText(et.getText()+"6");
			 	   }
			 	  });
			 	  
			b7.setOnClickListener(new View.OnClickListener() {
			 	   @Override
			 	   public void onClick(View v) {
			 	    // TODO Auto-generated method stub
			 	    et.setText(et.getText()+"7");
			 	   }
			 	  });
			 	  
			b8.setOnClickListener(new View.OnClickListener() {
			 	   @Override
			 	   public void onClick(View v) {
			 	    // TODO Auto-generated method stub
			 	    et.setText(et.getText()+"8");
			 	   }
			 	  });
			 	  
			b9.setOnClickListener(new View.OnClickListener() {
			 	   @Override
			 	   public void onClick(View v) {
			 	    // TODO Auto-generated method stub
			 	    et.setText(et.getText()+"9");
			 	   }
			 	  });
			
		 b0.setOnClickListener(new View.OnClickListener() {
			 	   @Override
			 	   public void onClick(View v) {
			     // TODO Auto-generated method stub
			 	    et.setText(et.getText()+"0");
			 	   }
			 	  });
		 
	  bdot.setOnClickListener(new View.OnClickListener() {
			 	   @Override
			    public void onClick(View v) {
			 	    // TODO Auto-generated method stub
			 	    et.setText(et.getText()+".");
			 	   }
			 	  });
			    
	badd.setOnClickListener(new View.OnClickListener() {
			 	   
			 	  @Override
			 	  public void onClick(View v) {
			 	   //val1=Integer.parseInt(et.getText()+"");
			 	   val1=Double.valueOf(et.getText().toString()+"");
			 	   add=true;
			 	   et.setText(null);
			 	  et2.setText(val1+"+");
				  }
			 	 });
	
	bsub.setOnClickListener(new View.OnClickListener() {
			   
				  @Override
			 	  public void onClick(View v) {
			 	   //val1=Integer.parseInt(et.getText()+"");
			 	  val1=Double.valueOf(et.getText().toString()+"");
				   sub=true;
				   et.setText(null);
				   et2.setText(val1+"-");
				  }
			 	 });
	
	bdiv.setOnClickListener(new View.OnClickListener() {
				  
				 @Override
			 	 public void onClick(View v) {
			  //val1=Integer.parseInt(et.getText()+"");
			  val1=Double.valueOf(et.getText().toString()+"");
			 	  div=true;
			 	  et.setText(null);
			 	 et2.setText(val1+"/");
			 }
				});
	
	bmul.setOnClickListener(new View.OnClickListener() {
			  
				 @Override
				 public void onClick(View v) {
				  //val1=Integer.parseInt(et.getText()+"");
				  val1=Double.valueOf(et.getText().toString()+"");
			  mul=true;
			  et.setText(null);
			  et2.setText(val1+"*");
				 }
			});
				 
	beq.setOnClickListener(new View.OnClickListener() {
				  
				 @Override
				 public void onClick(View v) {
				  //val2=Integer.parseInt(et.getText()+"");
				  val2=Double.valueOf(et.getText().toString()+"");
				  if (add==true) {
					 
				   et.setText(val1+val2+"");
				   et2.setText(val1+"+"+val2);
				   add=false;
				   
				  }
			 	  if (sub==true) {
			 	   
			 	   et.setText(val1-val2+"");
			 	   et2.setText(val1+"-"+val2);
				   sub=false;
				   
				  }
				  if (mul==true) {
				   et.setText(val1*val2+"");
				   et2.setText(val1+"*"+val2);
				   mul=false;
			 	  }
			 	  if (div==true) {
			 	   et.setText(val1/val2+"");
			 	  et2.setText(val1+"/"+val2);
			 	   div=false;
			 	  }
			 	 }			 	  
			 	});
	}
}
