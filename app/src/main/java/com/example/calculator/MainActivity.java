package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Stack;
import java.math.BigDecimal;
import java.lang.Math;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonAC,
            button_leftbra,button_rightbra,button_squ2,button_sin,button_PandM,button_percent,
            button_div,button_mul,button_sub,button_add,button_equ,button_p;

    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//为当前活动加载一个布局


        button0 = (Button) findViewById(R.id.button0);//获取布局里面定义的元素，findViewById返回的是view对象，这里转化为button实例
        button0.setOnClickListener(this);//为按钮设置一个监听器，来实现点击按钮的功能

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);

        buttonAC = (Button) findViewById(R.id.buttonAC);
        buttonAC.setOnClickListener(this);

        button_leftbra = (Button) findViewById(R.id.button_leftbra);
        button_leftbra.setOnClickListener(this);

        button_rightbra = (Button) findViewById(R.id.button_rightbra);
        button_rightbra.setOnClickListener(this);

        button_squ2 = (Button) findViewById(R.id.button_squ2);
        button_squ2.setOnClickListener(this);

        button_sin = (Button) findViewById(R.id.button_sin);
        button_sin.setOnClickListener(this);

        button_PandM = (Button) findViewById(R.id.button_PandM);
        button_PandM.setOnClickListener(this);

        button_percent = (Button) findViewById(R.id.button_percent);
        button_percent.setOnClickListener(this);

        button_div = (Button) findViewById(R.id.button_div);
        button_div.setOnClickListener(this);

        button_mul = (Button) findViewById(R.id.button_mul);
        button_mul.setOnClickListener(this);

        button_sub = (Button) findViewById(R.id.button_sub);
        button_sub.setOnClickListener(this);

        button_add = (Button) findViewById(R.id.button_add);
        button_add.setOnClickListener(this);

        button_equ = (Button) findViewById(R.id.button_equ);
        button_equ.setOnClickListener(this);

        button_p = (Button) findViewById(R.id.button_p);
        button_p.setOnClickListener(this);

        text = (EditText) findViewById(R.id.text);

    }

        public void onClick(View v){//通过监听器调用onClick()方法，view对象是所以控件的基类，所以这里有个自动转化，将button类型转化为view
            String str = text.getText().toString();
            switch (v.getId()) {//通过switch进行选择，判断点击那个按钮，因为所以的监听器都是调用onClick()方法
                case R.id.buttonAC:
                    str = "0";
                    text.setText(str);
                    break;
                case R.id.button0:
                    if (str.equals("0")) {
                        str = "0";//如果文本框只有0，则按下按钮后还是0
                    } else {
                        str += "0";//如果不是0，则将文本框里面添加字符0
                    }
                    text.setText(str);
                    break;
                case R.id.button1:
                    if (str.equals("0")) {
                        str = "1";
                    } else {
                        str += "1";
                    }
                    text.setText(str);
                    break;
                case R.id.button2:
                    if (str.equals("0")) {
                        str = "2";
                    } else {
                        str += "2";
                    }
                    text.setText(str);
                    break;
                case R.id.button3:
                    if (str.equals("0")) {
                        str = "3";
                    } else {
                        str += "3";
                    }
                    text.setText(str);
                    break;
                case R.id.button4:
                    if (str.equals("0")) {
                        str = "4";
                    } else {
                        str += "4";
                    }
                    text.setText(str);
                    break;
                case R.id.button5:
                    if (str.equals("0")) {
                        str = "5";
                    } else {
                        str += "5";
                    }
                    text.setText(str);
                    break;
                case R.id.button6:
                    if (str.equals("0")) {
                        str = "6";
                    } else {
                        str += "6";
                    }
                    text.setText(str);
                    break;
                case R.id.button7:
                    if (str.equals("0")) {
                        str = "7";
                    } else {
                        str += "7";
                    }
                    text.setText(str);
                    break;
                case R.id.button8:
                    if (str.equals("0")) {
                        str = "8";
                    } else {
                        str += "8";
                    }
                    text.setText(str);
                    break;
                case R.id.button9:
                    if (str.equals("0")) {
                        str = "9";
                    } else {
                        str += "9";
                    }
                    text.setText(str);
                    break;
                case R.id.button_p:
                    if (str.charAt(str.length() - 1) == '+' || str.charAt(str.length() - 1) == '-' || str.charAt(str.length() - 1) == '×' || str.charAt(str.length() - 1) == '÷' || str.charAt(str.length() - 1) == '.'||str.contains(".")) {
                        Toast.makeText(MainActivity.this, "Input error!", Toast.LENGTH_SHORT).show();
                        text.setText(str);//通过静态方法makeToast（）方法来创造对象，然后调用show（）进行显示。
                    }//如果文本框的最后一个字符为+、-、×、÷、.则表达式有问题，即出现+. -. ×. ÷. 等情况 则通过Toast方法给出提示
                    else {
                        str += ".";
                        text.setText(str);
                    }//如果表达式正确，则文本框添加该字符
                    break;
                case R.id.button_add:
                    if (str.charAt(str.length() - 1) == '+' || str.charAt(str.length() - 1) == '-' || str.charAt(str.length() - 1) == '×' || str.charAt(str.length() - 1) == '÷' || str.charAt(str.length() - 1) == '.') {
                        Toast.makeText(MainActivity.this, "Input error!", Toast.LENGTH_SHORT).show();
                        text.setText(str);
                    } else {
                        str += "+";
                        text.setText(str);
                    }
                    break;
                case R.id.button_sub:
                    if (str.charAt(str.length() - 1) == '+' || str.charAt(str.length() - 1) == '-' || str.charAt(str.length() - 1) == '×' || str.charAt(str.length() - 1) == '÷' || str.charAt(str.length() - 1) == '.') {
                        Toast.makeText(MainActivity.this, "Input error!", Toast.LENGTH_SHORT).show();
                        text.setText(str);
                    } else {
                        str += "-";
                        text.setText(str);
                    }
                    break;
                case R.id.button_mul:
                    if (str.charAt(str.length() - 1) == '+' || str.charAt(str.length() - 1) == '-' || str.charAt(str.length() - 1) == '×' || str.charAt(str.length() - 1) == '÷' || str.charAt(str.length() - 1) == '.') {
                        Toast.makeText(MainActivity.this, "Input error!", Toast.LENGTH_SHORT).show();
                        text.setText(str);
                    } else {
                        str += "×";
                        text.setText(str);
                    }
                    break;
                case R.id.button_div:
                    if (str.charAt(str.length() - 1) == '+' || str.charAt(str.length() - 1) == '-' || str.charAt(str.length() - 1) == '×' || str.charAt(str.length() - 1) == '÷' || str.charAt(str.length() - 1) == '.') {
                        Toast.makeText(MainActivity.this, "Input error!", Toast.LENGTH_SHORT).show();
                        text.setText(str);
                    } else {
                        str += "÷";
                        text.setText(str);
                    }
                    break;
                case R.id.button_leftbra:
                    if (str.length() == 1) {
                        str = "(";
                    }//当文本框里面只有0时，即没有输入数据时，则点击（按钮，第一个字符为（
                    else if (!str.contains("+") && !str.contains("-") && !str.contains("×") && !str.contains("÷")) {
                        str = "(" + str;
                    }//若文本框里面只有数字，而没有运算符时，则点击（按钮时，括号会加到最左边
                    else {
                        str += "(";
                    }
                    text.setText(str);
                    break;//
                case R.id.button_rightbra:
                    if (str.length() == 1) {
                        str = "0";
                    }//如果未输入数据，则点击）按钮是无用的，则文本框还是为0
                    else {
                        str += ")";
                    }
                    text.setText(str);
                    break;

                case R.id.button_equ:
                    if (str.charAt(str.length() - 1) == '+' || str.charAt(str.length() - 1) == '-' || str.charAt(str.length() - 1) == '×' || str.charAt(str.length() - 1) == '÷') {
                        Toast.makeText(MainActivity.this, "Please complete the formula!", Toast.LENGTH_SHORT).show();
                        text.setText(str);
                    } else {
                        String ero = isMatched(str);//判断括号是否匹配
                        if (ero.equals("no error")) {//如果括号匹配则通过getResult（）方法返回计算后的字符串
                            String re = getResult();
                            if (re.contains("Infinity")) {
                                Toast.makeText(MainActivity.this, "0 cannot be used as a divior!", Toast.LENGTH_SHORT).show();
                                text.setText("0");
                            } else {
                                text.setText(re);
                            }
                        } else {
                            Toast.makeText(MainActivity.this, ero, Toast.LENGTH_SHORT).show();
                        }
                    }
                    break;
                case R.id.button_squ2:
                    if (str.charAt(0) == '-') {
                        Toast.makeText(MainActivity.this, "Negative numbers cannot be squared!", Toast.LENGTH_SHORT).show();
                        text.setText("0");
                    }//如果为负数则通过Toast给出信息
                    else if (str.contains("+") || str.contains("-") || str.contains("×") || str.contains("÷") ||str.contains("(") ||str.contains(")")) {
                        Toast.makeText(MainActivity.this, "符号不能开根号", Toast.LENGTH_SHORT).show();
                        text.setText("0");
                    }//开根号应该为数值，不能包含表达式,其中也不能包含括号
                    else {
                        double x = Double.parseDouble(str);
                        x = Math.sqrt(x);
                        String x2 = String.format("%.9f", x);
                        x2 = x2.replaceAll("0+?$", "");//去掉多余的0
                        x2 = x2.replaceAll("[.]$", "");//如最后一位是.则去掉
                        text.setText(x2);
                    }
                    break;

                case R.id.button_percent:
                    if (str.contains("+")  || str.contains("×") || str.contains("÷") ||str.contains("(") ||str.contains(")")||str.lastIndexOf('-')>0) {
                        Toast.makeText(MainActivity.this, "除第一个负号外，其余符号不能开百分号", Toast.LENGTH_SHORT).show();
                        text.setText("0");
                        break;
                    }//使用percent时，里面的表达式应该为数值，不能包含表达式,其中也不能包含括号
                    double per = Double.parseDouble(str);
                    per = per / 100;
                    String per1 = "" + per;
                    per1 = per1.replaceAll("0+?$", "");//去掉多余的0
                    per1 = per1.replaceAll("[.]$", "");//如最后一位是.则去掉
                    text.setText(per1);
                    break;

                case R.id.button_sin:
                    if (str.contains("+") || str.contains("-") || str.contains("×") || str.contains("÷") ||str.contains("(") ||str.contains(")")) {
                        Toast.makeText(MainActivity.this, "符号不能开sin号", Toast.LENGTH_SHORT).show();
                        text.setText("0");
                        break;
                    }//使用sin时，里面的表达式应该为数值，不能包含表达式,其中也不能包含括号
                    double sinn = Double.parseDouble(str);
                    sinn = Math.toRadians(sinn);
                    sinn = Math.sin(sinn);
                    String sinn1 = String.format("%.9f", sinn);//规避极小误差
                    sinn1 = sinn1.replaceAll("0+?$", "");//去掉多余的0
                    sinn1 = sinn1.replaceAll("[.]$", "");//如最后一位是.则去掉
                    text.setText(sinn1);
                    break;

                case R.id.button_PandM:
                    if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
                        if (str.equals("0")) {
                            text.setText("0");
                        } else {
                            text.setText("-" + str);
                        }//判断第一个字符时候为除0之外的数值，若是则变为负数
                    } else if (str.charAt(0) == '-')
                        text.setText(str.substring(1, str.length()));
                    else
                        text.setText(str);
                    break;//如果是负数，则去掉第一个字符即负号，使之变为正数
                default:
                    break;

            }
        }

            //将中缀表达式转换成后缀表达式
            public static StringBuffer toPostfix(String infix){
                Stack<String> stack=new Stack<String>();   //运算符栈,顺序栈
                StringBuffer postfix=new StringBuffer(infix.length()*2);   //后缀表达式字符串
                int i=0;
                while(i<infix.length()){
                    char ch=infix.charAt(i);
                    switch(ch){
                        case '+':
                        case '-':
                            while(!stack.isEmpty()&&!stack.peek().equals("(")) //如果栈不为空且栈顶元素不是"(",则出栈
                                postfix.append(stack.pop());   //且添加到后缀表达式串
                            stack.push(ch+""); //ch入栈
                            i++;
                            break;

                        case '×':
                        case '÷':
                            while(!stack.isEmpty()&&(stack.peek().equals("×")||stack.peek().equals("÷")))  //如果栈顶元素不为空且栈顶元素是"*"或是"/"时,则出栈
                                postfix.append(stack.pop());
                            stack.push(ch+"");
                            i++;
                            break;

                        case '(':
                            stack.push(ch+""); //直接入栈
                            i++;
                            break;

                        case ')':
                            String out=stack.pop();
                            while(out!=null&&!out.equals("(")){    //如果栈顶元素不为空且不为"("时
                                postfix.append(out);   //添加到后缀表达式串
                                out=stack.pop();   //把此时位于栈顶的"("弹出
                            }
                            i++;
                            break;

                        default:
                            while((i<infix.length()&&ch>='0'&&ch<='9')||(i<infix.length()&&ch=='.')){
                                postfix.append(ch);    //如果是数字直接添加到后缀表达式串
                                i++;
                                if(i<infix.length())
                                    ch=infix.charAt(i);
                            }
                            postfix.append(" ");
                    }

                }
                while(!stack.isEmpty())       //所有运算符出栈
                    postfix.append(stack.pop());   //添加到后缀表达式中
                return postfix;
            }

            //计算后缀表达式
            public static Double toValue(StringBuffer postfix){
                Stack<Double> stack=new Stack<Double>();   //操作数栈,链式栈
                double value=0;
                int j=0;
                for(int i=0;i<postfix.length();i++){
                    j=i;
                    char ch=postfix.charAt(i);
                    if ((ch>='0'&&ch<='9')||ch=='.') {
                        value=0;
                        while(ch!=' '){
                            while(ch!=' '&&ch!='.'){
                                value=value*10+ch-'0';
                                j++;
                                ch=postfix.charAt(++i);
                            }
                            if(ch!=' '&&ch=='.')
                                ch=postfix.charAt(++i);
                            while(ch!=' '&&(i>=j+1)){
                                BigDecimal valueBD=new BigDecimal(Double.toString(value));
                                BigDecimal chBD=new BigDecimal(Double.toString(ch-'0'));
                                BigDecimal nBD=new BigDecimal(Double.toString(Math.pow(10,i-j)));
                                double temp=chBD.divide(nBD).doubleValue();
                                BigDecimal tempBD=new BigDecimal(Double.toString(temp));
                                value=valueBD.add(tempBD).doubleValue();
                                ch=postfix.charAt(++i);
                            }

                            stack.push(value);
                        }

                    }
                    else{
                        if(ch!=' '){
                            Double y=stack.pop();
                            Double x;
                            if(stack.isEmpty()){
                                x=0.0;
                            }
                            else
                            {
                                x=stack.pop();
                            }

                            switch(ch){
                                case'+':
                                    value=x+y;
                                    break;
                                case'-':
                                    value=x-y;
                                    break;
                                case'×':
                                    value=x*y;
                                    break;
                                case'÷':
                                    value=x/y;
                                    break;
                            }
                            stack.push(value);
                        }
                    }

                }
                return stack.pop();
            }
            public String getResult(){
                String infix = text.getText().toString();
                StringBuffer postfix=toPostfix(infix);//首先将中缀表达式转换成后缀表达式
                Double result=toValue(postfix);//通过后缀表达式计算其值，只是在计算的时候将字符串转化为double，随后并再将其转化为字符串，为下一次计算做准备
                String re=String.format("%.7f",result);//规避极小误差
                re = re.replaceAll("0+?$", "");//去掉多余的0
                re = re.replaceAll("[.]$", "");//如最后一位是.则去掉
                return re;
            }

            public static String isMatched(String infix){//用来匹配括号
                Stack<String> stack=new Stack<String>();//建立一个栈
                for (int i=0;i<infix.length();i++){
                    char ch=infix.charAt(i);
                    switch(ch){
                        case'(':
                            stack.push(ch+"");//只对括号进行判断如果是左括号则入栈
                            break;
                        case')':
                            if(stack.isEmpty()||!stack.pop().equals("("))
                                return "expect   (";//如果是右括号，如果栈是空，或者栈顶元素出栈并如果该元素不是"）"则表明缺少"（"，并返回其信息
                    }
                }
                return(stack.isEmpty())?"no error":"expect   )";//如果括号匹配则返回no error
            }
}
