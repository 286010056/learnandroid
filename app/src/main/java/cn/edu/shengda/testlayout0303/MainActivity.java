package cn.edu.shengda.testlayout0303;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_my1=null;
    Button btn_my2=null;
    EditText editText=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        btn_my1=findViewById(R.id.btn_my1);
        btn_my2=findViewById(R.id.btn_my2);
        editText=findViewById(R.id.editText);
        btn_my1.setOnClickListener(this);
        btn_my2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_my1:
                Log.i("MSG","按钮1被点击");
                btn1Process();
                break;
            case R.id.btn_my2:
                Log.i("MSG","按钮2被点击");
                btn2Process();
                break;
                default:
                    break;
        }
    }

    /**
     * author:wts
     * date:2020-3-3
     * 字符串前加“sd"
     */
    private void btn1Process(){
        String txt=editText.getText().toString();
        String txt2="sd"+txt;
        editText.setText(txt2);
        Toast.makeText(this,"处理后的字符串是："+txt2,Toast.LENGTH_SHORT).show();
        Log.i("MSG","处理后的字符串是："+txt2);
    }

    /**
     * author:***
     * date:2020-3-3
     * 字符串做***处理(比如手机号验证、身份证验证、银行卡开户行的默认区分）
     */
    private void btn2Process(){
        Toast.makeText(this,"同学们自由发挥",Toast.LENGTH_SHORT).show();

    }
}
