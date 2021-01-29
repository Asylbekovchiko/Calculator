package com.example.calc1;

public class Model {
    private MainActivity mainActivity;
    private String leftV;
    private String temp;
    private String rightV;
    private char action;

    public Model(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        this.mainActivity = mainActivity;
        leftV = "";
        rightV = "";
        action = '@';
        temp = "";

    }

    public void doAction(String value) {
        if (value.equals("C")) {
            leftV = "";
            rightV = "";
            action = '@';
            temp = "";
        }else if (value.equals("/")) {
            leftV = temp;
            action = '/';
            temp = "";
            return;
    }else if (value.equals("*")) {
            leftV = temp;
            action = '*';
            temp = "";
            return;
    }else if (value.equals("1")) {
            temp = temp + 1;


        }else if (value.equals("D")) {
            temp = temp.substring(0, temp.length() - 1);
    }else if (value.equals("2")) {
            temp = temp + 2;

        }else if (value.equals("-")) {
            leftV = temp;
            action = '-';
            temp = "";
            return;
    }else if(value.equals("+")){
            leftV=temp;
            action='+';
            temp="";
            return;

        }else if (value.equals("Persent")) {
            leftV = temp;
            action = '%';
            temp = "";
            return;
    }else if (value.equals("CE")) {
            leftV = "";
            rightV = "";
            action = '@';
            temp = "";
    }else if (value.equals("3")) {
            temp = temp + 3;


        } else if (value.equals("4")) {
            temp = temp + 4;

        } else if (value.equals("5")) {
            temp = temp + 5;

        }else if (value.equals("6")) {
            temp = temp + 6;

        }else if (value.equals("7")) {
            temp = temp + 7;

        }else if (value.equals("8")) {
            temp = temp + 8;
        }else if (value.equals("9")) {
            temp = temp + 9;
        }else if (value.equals("0")) {
            temp = temp + 0;
        }else if (value.equals("=")) {
            rightV=temp;
            double leftNumber=Double.parseDouble(leftV);
            double rightNumber=Double.parseDouble(rightV);
            double answer=0.0;
            switch(action){
                case '+':
                    answer=leftNumber+rightNumber;
                    break;
                case '-':
                    answer=leftNumber-rightNumber;
                    break;
                case '/':
                    try {
                        answer = leftNumber / rightNumber;
                    }catch (ArithmeticException ae){
                        mainActivity.update("/");
                        return;
                    }
                    break;
                case '*':
                    answer=leftNumber*rightNumber;
                    break;

                case '%':
                    answer=rightNumber/100*leftNumber;
                    break;

            }
            temp=""+answer;
            char point = temp.charAt(temp.length()-2);
            char zero = temp.charAt(temp.length()-1);
            if(point == '.' && zero=='0'){
                temp=temp.substring(0,temp.length()-2);
            }

        }
            mainActivity.update(temp);
    }

}