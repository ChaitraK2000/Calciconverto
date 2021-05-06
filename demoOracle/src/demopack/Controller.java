package demopack;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.net.URL;
import java.util.ResourceBundle;
public class Controller implements Initializable {
    //elements of basic Calculator
    char[] xyz = new char[10];
    private double temp = 0;
    private String[] a1 = new String[10];
    private String xy = " ", x1 = " ";
    private int[] i = new int[10];
    private int c1 = 0, c2 = 0,c3=0;
    int k, n = 1;
    private double[] num = new double[10];
    // button of calculator
    @FXML
    public Button equal;
    //choice box arrays
    private String[] choi={"Bit","Byte","Kilobyte","Megabyte","Gigabyte","Terabyte"};
    private String[] choi2={"Bit","Byte","Kilobyte","Megabyte","Gigabyte","Terabyte"};
    private String[] choi33={"Celsius","Farenheit","Kelvin"};
    private String[] choi55={"Milimetre(mm)","Centimetre(cm)","Metre(m)","Kilometre(km)","Inch(in)","Foot(ft)","Yard(yd)","Mile(mi)","Nautical Mile(NM)"};
    private String[] choi77={"Kilogram(kg)","Gram(g)","pound(lb)","ounce(oz)"};
    @FXML
//clear button of calculator
    public Button clear;
    @FXML
//text field of data conversion tab
    public TextField text1;
    @FXML
//text field of data conversion tab
    public TextField text2;
    @FXML
//text field of temperature tab
    public TextField text3;
    @FXML
//text field of temperature tab
    public TextField text4;
    @FXML
//label of calculator
    public Label lable;
    @FXML
//choice box of temperature tab
    public ChoiceBox<String> choi3= new ChoiceBox(FXCollections.observableArrayList(choi33));
    @FXML
//choice box of temperature tab
    public ChoiceBox choi4=new ChoiceBox(FXCollections.observableArrayList(choi33));
    @FXML
    //button of data tab
    public Button convert;
    @FXML
    //button of temperature tab
    public Button convert1;
    @FXML
    //button of length tab
    public Button convert2;
    @FXML
    //choice box of data tab
    public ChoiceBox choi1= new ChoiceBox(FXCollections.observableArrayList(choi));
    @FXML
    //choice box of data tab
    public ChoiceBox choi22= new ChoiceBox(FXCollections.observableArrayList(choi2));
    @FXML
//choice box of length tab
    public ChoiceBox choi5=new ChoiceBox(FXCollections.observableArrayList(choi55));
    @FXML
// choice box of lenght tab
    public ChoiceBox choi6=new ChoiceBox(FXCollections.observableArrayList(choi55));
    @FXML
//text field of length tab
    public TextField text5;
    @FXML
//text field of length tab
    public TextField text6;
    @FXML
//choice box of mass tab
    public ChoiceBox<String> choi7=new ChoiceBox(FXCollections.observableArrayList(choi77));
    @FXML
//choice box of mass tab
    public ChoiceBox<String> choi8=new ChoiceBox(FXCollections.observableArrayList(choi77));
    @FXML
//text field of mass tab
    public TextField text7;
    @FXML
//text field of mass tab
    public TextField text8;
    @FXML
//button of mass tab
    public Button convert3;
    @FXML
// button of angle tab
    public Button convert4;
    @FXML
//text field of angle tab
    public TextField text9;
    @FXML
//text field of angle tab
    public TextArea text10;
    @FXML
//choice box of angle tab
    public ChoiceBox choi9=new ChoiceBox(FXCollections.observableArrayList("Degree to Radian","Radian to Degree"));
    //buttons of calculator
    @FXML
    public Button no0;
    @FXML
    public Button no1;
    @FXML
    public Button no2;
    @FXML
    public Button no3;
    @FXML
    public Button no4;
    @FXML
    public Button no5;
    @FXML
    public Button no6;
    @FXML
    public Button no7;
    @FXML
    public Button no8;
    @FXML
    public Button no9;
    @FXML
    public Button plus;
    @FXML
    public Button minus;
    @FXML
    public Button multiply;
    @FXML
    public Button divide;
    @FXML
    public Button dot;
    //initialize method
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //elements of calculator
        no0.setOnAction(event -> {
            System.out.println("0 selected");
            int x = 0;
            set(x);
        });
        no1.setOnAction(event -> {
            int x = 1;
            set(x);
        });
        no2.setOnAction(event -> {
            int x = 2;
            set(x);
        });
        no3.setOnAction(event -> {
            int x = 3;
            set(x);
        });
        no4.setOnAction(event -> {
            int x = 4;
            set(x);
        });
        no5.setOnAction(event -> {
            int x = 5;
            set(x);
        });
        no6.setOnAction(event -> {
            int x = 6;
            set(x);
        });
        no7.setOnAction(event -> {
            int x = 7;
            set(x);
        });
        no8.setOnAction(event -> {
            int x = 8;
            set(x);
        });
        no9.setOnAction(event -> {
            int x = 9;
            set(x);
        });
        plus.setOnAction(event -> {
            int x = 10;
            set(x);
        });
        minus.setOnAction(event -> {
            int x = 11;
            set(x);
        });
        multiply.setOnAction(event -> {
            int x = 12;
            set(x);
        });
        divide.setOnAction(event1 -> {
            int x = 13;
            set(x);
        });
        dot.setOnAction(event -> {
            set(14);
        });
        clear.setOnAction(event -> {
            lable.setText(null);
            xy = " ";
            x1 = " ";
            temp=0;
            c3=0;
            c2=0;
            c1=0;
        });
        equal.setOnAction(event -> {
            calculate();
        });
        //elements of unit convertor
        text4.setEditable(false);
        text2.setEditable(false);
        text6.setEditable(false);
        text8.setEditable(false);
        text10.setEditable(false);
        //data tab
        choi1.getItems().addAll(choi);
        choi22.getItems().addAll(choi2);
        choi1.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                oldValue = 0;
                int choice = newValue.intValue();
                choi1.setOnAction(event -> {
                    System.out.println(choice);
                    choi22.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
                        @Override
                           public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                            oldValue = 0;
                            int s = newValue.intValue();
                            choi22.setOnAction(event1 -> {
                                System.out.println("2nd val" + s);
                                convert.setOnAction(event2 -> {
                                    alertAnswer(choice, s);
                                });
                            });
                        }
                    });
                });
            }
        });
        //temperature tab
        choi3.getItems().addAll(choi33);
        choi4.getItems().addAll(choi33);
        choi3.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                oldValue = 0;
                int choice = newValue.intValue();
                choi3.setOnAction(event -> {
                    System.out.println(choice);
                    choi4.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
                        @Override
                        public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                            oldValue = 0;
                            int s = newValue.intValue();
                            choi4.setOnAction(event1 -> {
                                System.out.println("2nd val" + s);
                                convert1.setOnAction(event2 -> {
                                    alertAnswer1(choice, s);
                                });
                            });
                        }
                    });
                });
            }
        });
        //length tab
        choi5.getItems().addAll(choi55);

        choi5.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                oldValue = 0;
                int choice = newValue.intValue();
                choi5.setOnAction(event -> {
                    choi6.getItems().addAll(choi55);
                    choi6.setValue("Milimitre(mm)");
                    System.out.println(choice);
                    choi6.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
                        @Override
                        public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                            oldValue = 0;
                            int s = newValue.intValue();
                            choi6.setOnAction(event1 -> {

                                System.out.println("2nd val" + s);
                                convert2.setOnAction(event2 -> {
                                    alertAnswer2(choice, s);
                                });
                            });

                        }
                    });
                });
            }
        });
        //mass tab
        choi7.getItems().addAll("Kilogram", "gram", "pound", "ounce");
        choi8.getItems().addAll(choi77);
        choi7.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                oldValue=0;
                int choice=newValue.intValue();
                choi7.setOnAction(event -> {
                            System.out.println(choice);
                            choi8.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
                                @Override
                                public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                                    oldValue=0;
                                    int s=newValue.intValue();
                                    choi8.setOnAction(event1 -> {
                                        System.out.println(s);
                                        convert3.setOnAction(event2 -> {
                                            System.out.println("button pressed");
                                            alertAnswer3(choice,s);
                                        });
                                    });
                                }
                            });
                        }
                );

            }
        });
        //angle tab

        choi9.getItems().addAll("Degree to Radian","Radian to Degree");

        choi9.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                oldValue=0;
                int choice=newValue.intValue();
                choi9.setOnAction(event -> {
                    convert4.setOnAction(event1 -> {
                        alertAnswer4(choice);
                    });
                });
            }
        });
    }

    //angle tab function
    private void alertAnswer4(int choice) {
        String x,y;
        x=text9.getText();
        double xy;
        if (x.isEmpty()) {
            alertEmptytext();
            return;
        }
        try {
            Double.parseDouble(x);
        } catch (NumberFormatException e) {
            alertEmptytext();
            return;
        }
        xy = Double.parseDouble(x);
        switch (choice)
        {
            case 0:
                double newAng=0.0;
                newAng=(xy*3.14)/180;
                y=Double.toString(newAng);
                text10.setText(y+" "+"Radians");
                break;
            case 1:
                newAng=(xy*180)/3.14;
                y=Double.toString(newAng);
                text10.setText(y+" "+"Degrees");
                break;
            default:
                return;
        }
    }
    //mass tab
    private void alertAnswer3(int choice, int s) {
        helper help = new helper();
        double xy, xyz;
        String x,a;
        x = text7.getText();
        System.out.println(x);
        if (x.isEmpty()) {
            alertEmptytext();
            return;
        }
        try {
            Double.parseDouble(x);
        } catch (NumberFormatException e) {
            System.out.println("hey not a number");
            alertEmptytext();
            return;
        }
        xy = Double.parseDouble(x);
        xyz = help.compare3(choice, s, xy);
        a = Double.toString(xyz);
        text8.setText(x+" "+choi77[choice]+" "+"="+a+" "+choi77[s]);
    }
    //length tab
    private void alertAnswer2(int choice, int s) {
        helper help = new helper();
        double xy, xyz;
        String x,y,a;
        x = text5.getText();
        y = x;
        if (y.isEmpty()) {
            alertEmptytext();
            return;
        }
        try {
            Double.parseDouble(y);
        } catch (NumberFormatException e) {
            alertEmptytext();
            return;
        }
        xy = Double.parseDouble(x);
        xyz = help.compare2(choice, s, xy);
        a = Double.toString(xyz);
        text6.setEditable(false);
        text6.setText(x+choi55[choice]+"="+a+choi55[s]);
    }
    //tempreture tab
    private void alertAnswer1(int choice, int s) {
        helper help = new helper();
        double xy, xyz;
        String x, y;
        String a;
        x = text3.getText();
        y = x;
        if (y.isEmpty()) {
            alertEmptytext();
            return;
        }
        try {
            Double.parseDouble(y);
        } catch (NumberFormatException e) {
            System.out.println("hey not a number");
            alertEmptytext();
            return;
        }
        xy = Double.parseDouble(x);
        xyz = help.compare1(choice, s, xy);
        a = Double.toString(xyz);
        text4.setEditable(false);
        text4.setText(x+" "+choi33[choice]+" "+"="+a+" "+choi33[s]);
    }
    //data tab
    private void alertAnswer(int choice, int s) {
        helper help = new helper();
        double xy, xyz;
        String x, y;
        String a;
        x = text1.getText();
        y = x;
        if (y.isEmpty()) {
            alertEmptytext();
            return;
        }
        try {
            Double.parseDouble(y);
        } catch (NumberFormatException e) {
            System.out.println("hey not a number");
            alertEmptytext();
            return;
        }
        xy = Double.parseDouble(x);
        xyz = help.compare(choice, s, xy);
        a = Double.toString(xyz);
        text2.setText(x+" "+choi[choice]+" = "+a+" "+choi[s]);
        text2.setVisible(true);

    }
    //illegal format indicator for unit convertor
    private void alertEmptytext()
    {
        Alert alt=new Alert(Alert.AlertType.ERROR);
        alt.setTitle("Error in format");
        alt.setContentText("Your Value to be entered is Empty or not in proper format please try again");
        alt.show();

    }
    // label of calculator
    private void set(int i) {
        switch (i) {
            case 0:
                x1 = "0";
                xy = xy.concat(x1);
                lable.setText(xy);
                break;
            case 1:
                x1 = "1";
                xy = xy.concat(x1);
                lable.setText(xy);
                break;
            case 2:
                x1 = "2";
                xy = xy.concat(x1);
                lable.setText(xy);
                break;
            case 3:
                x1= "3";
                xy = xy.concat(x1);
                lable.setText(xy);
                break;
            case 4:
                x1= "4";
                xy = xy.concat(x1);
                lable.setText(xy);
                break;
            case 5:
                x1= "5";
                xy = xy.concat(x1);
                lable.setText(xy);
                break;
            case 6:
                x1= "6";
                xy = xy.concat(x1);
                lable.setText(xy);
                break;
            case 7:
                x1= "7";
                xy = xy.concat(x1);
                lable.setText(xy);
                break;
            case 8:
                x1= "8";
                xy = xy.concat(x1);
                lable.setText(xy);
                break;
            case 9:
                x1 = "9";
                xy = xy.concat(x1);
                lable.setText(xy);
                break;
            case 10:
                x1 = "+";
                xy = xy.concat(x1);
                lable.setText(xy);
                break;
            case 11:
                x1 = "-";
                xy = xy.concat(x1);
                lable.setText(xy);
                break;
            case 12:
                x1 = "X";
                xy = xy.concat(x1);
                lable.setText(xy);
                break;
            case 13:
                x1 = "/";
                xy = xy.concat(x1);
                lable.setText(xy);
                break;
            case 14:
                x1 = ".";
                xy = xy.concat(x1);
                lable.setText(xy);
                break;
            default:
                xy = " ";
        }
    }
    //calculator's function
    private void calculate() {
        int count=0;
        for(int f=0;f<xy.length();f++)
        {
            if(xy.charAt(f)=='+'||xy.charAt(f)=='-'||xy.charAt(f)=='X'||xy.charAt(f)=='/')
                count=count+1;
        }
        if(count==0)
        {
            lable.setText("No operator");
            return;
        }
        if(xy.isEmpty()||xy==" ")
        {
            lable.setText("No values Present");
            return;
        }
        if(xy.charAt(xy.length()-1)=='+'||xy.charAt(xy.length()-1)=='-'||xy.charAt(xy.length()-1)=='X'||xy.charAt(xy.length()-1)=='/'||xy.charAt(xy.length()-1)=='.')
        {
            lable.setText("Illegal format.");
            return;
        }
        int a;
        for (a = 0; a < xy.length(); a++) {
            if (xy.charAt(a) == '+' || xy.charAt(a) == '-' || xy.charAt(a) == 'X' || xy.charAt(a) == '/') {
                xyz[c1] = xy.charAt(a);
                i[c2] = xy.indexOf(xy.charAt(a));
                c1++;
                c2++;
            }
        }
        int b = i[0];
        int c = 1;
        for (int k = 0; k <= c2; k++) {
            if(c>b||b==0) {
                b = xy.length();
                System.out.println(b);
                a1[c3] = xy.substring(c, b);
                num[c3]=Double.parseDouble(a1[c3]);
                c3++;
            }
            else {
                a1[c3] = xy.substring(c, b);
                System.out.println(a1[c3]);
                c = i[k] + 1;
                System.out.println("c=" + c);
                num[c3]=Double.parseDouble(a1[c3]);
                c3++;
                b = i[k + 1];
                System.out.println("b=" + b);
            }
        }
        int d;
        int e=1;
        temp=num[0];
        for(d=0;d<=c2&&e<=c3;d++)
        {
            if(xyz[d]=='+')
            {
                temp=temp+num[e];
                System.out.println(temp);
                e++;
            }
            if(xyz[d]=='-')
            {
                temp=temp-num[e];
                System.out.println(temp);
                e++;
            }
            if(xyz[d]=='X')
            {
                temp=temp*num[e];
                System.out.println(temp);
                e++;
            }
            if(xyz[d]=='/')
            {
                temp=temp/num[e];
                System.out.println(temp);
                e++;
            }
        }
        String p=Double.toString(temp);
        lable.setText(xy+"\n="+p);
    }
}





