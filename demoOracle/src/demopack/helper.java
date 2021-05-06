package demopack;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class helper {






        public double compare(int choice, int s, double text) {
            double xy;
            switch (choice) {
                case 0:
                    switch (s) {

                        case 0:
                            xy = 0;
                            return text;


                        case 1:
                            xy = text * 0.125;
                            return xy;

                        case 2:
                            xy = text * 0.0001220703;
                            return xy;

                        case 3:
                            xy = text * 0.0000001192;
                            return xy;

                        case 4:
                            xy = text * 0.000000000116415322;
                            return xy;

                        case 5:
                            xy = text * 0.000000000000113686838;
                            return xy;

                        default:
                            return 0;
                    }



                case 1:


                    switch (s) {

                        case 0:
                            xy = text * 8;
                            return xy;


                        case 1:
                            xy = text;
                            return xy;

                        case 2:
                            xy = text * 0.0009765625;
                            return xy;

                        case 3:
                            xy = text * 0.0000009537;
                            return xy;

                        case 4:
                            xy = text * 0.0000000009;
                            return xy;

                        case 5:
                            xy = text * 0.000000000000909494702;
                            return xy;

                        default:
                            return 0;
                    }
                case 2:
                    switch (s) {

                        case 0:
                            xy = text * 8192;
                            return xy;


                        case 1:
                            xy = text * 1024;
                            return xy;

                        case 2:
                            xy = text;
                            return xy;

                        case 3:
                            xy = text * 0.0009765625;
                            return xy;

                        case 4:
                            xy = text * 0.0000009537;
                            return xy;

                        case 5:
                            xy = text * 0.0000000009;
                            return xy;

                        default:
                            return 0;
                    }
                case 3:
                    switch (s) {

                        case 0:
                            xy = text * 8388608;
                            return xy;


                        case 1:
                            xy = text * 1048576;
                            return xy;

                        case 2:
                            xy = text * 1024;
                            return xy;

                        case 3:
                            xy = text;
                            return xy;

                        case 4:
                            xy = text * 0.0009765625;
                            return xy;

                        case 5:
                            xy = text * 0.0000009537;
                            return xy;

                        default:
                            return 0;
                    }
                case 4:
                    switch (s) {


                        case 2:
                            xy = text * 1048576;
                            return xy;

                        case 3:
                            xy = text * 1024;
                            return xy;

                        case 4:
                            xy = text;
                            return xy;

                        case 5:
                            xy = text * 0.0009765625;
                            return xy;

                        default:
                            return 0;

                    }
                case 5:
                    switch (s) {


                        case 3:
                            xy = text * 1048576;
                            return xy;

                        case 4:
                            xy = text * 1024;
                            return xy;

                        case 5:
                            xy = text;
                            return xy;

                        default:
                            return 0;

                    }
                default:
                    return 0;
            }


        }
        public double compare1(int choice,int s,double text){
            double xyz;
            switch (choice)
            {
                case 0:
                    switch(s){
                        case 0:
                            return text;
                        case 1:
                            xyz=(text*(9/5)+32);
                            return xyz;
                        case 2:
                            xyz=(text+273.15);
                            return  xyz;



                    }
                case 1:
                    switch(s){
                        case 0:
                            xyz=(text-32)*(5/9);
                            return xyz;
                        case 1:
                            return text;
                        case 2:
                            xyz=((text-32)*(5/9))+273.15;
                            return  xyz;
                    }
                case 2:
                    switch(s){
                        case 0:
                            xyz=text-273.15;
                            return xyz;
                        case 1:
                            xyz=(text*(9/5)+32)+273.15;
                            return text;
                        case 2:

                            return  text;
                    }
                default:
                    return 0;



            }


        }
        public double compare2(int choice,int s,double text)
        {
            double xyz;
            switch (choice)
            {
                case 0:
                    switch(s) {
                        case 0:
                            return text;
                        case 1:
                            xyz = text * 0.1;
                            return xyz;
                        case 2:
                            xyz = text * 0.001;
                            return xyz;
                        case 3:
                            xyz = text * 0.000001;
                            return xyz;
                        case 4:
                            xyz = text * 0.0393700787;
                            return xyz;
                        case 5:
                            xyz = text * 0.0032808399;
                            return xyz;
                        case 6:
                            xyz = text * 0.0010936133;
                            return xyz;
                        case 7:
                            xyz = text * 0.0000006214;
                            return xyz;
                        case 8:
                            xyz = text * 0.00000054;
                            return xyz;
                        default:
                            return 0;
                    }
                case 1:
                    switch (s) {
                        case 0:
                            xyz = text * 10;
                            return xyz;
                        case 1:
                            return text;
                        case 2:
                            xyz = text * 0.01;
                            return xyz;
                        case 3:
                            xyz = text * 0.00001;
                            return xyz;
                        case 4:
                            xyz = text * 0.3937007874;
                            return xyz;
                        case 5:
                            xyz = text * 0.032808399;
                            return xyz;
                        case 6:
                            xyz = text * 0.010936133;
                            return xyz;
                        case 7:
                            xyz = text * 0.0000062137;
                            return xyz;
                        case 8:
                            xyz = text * 0.0000053996;
                            return xyz;

                        default:
                            return 0;
                    }
                case 2:
                    switch (s) {
                        case 0:
                            xyz = text * 1000;
                            return xyz;
                        case 1:
                            xyz=text*100;
                            return xyz;
                        case 2:

                            return text;
                        case 3:
                            xyz = text * 0.001;
                            return xyz;

                        case 4:
                            xyz = text * 39.3700787402;
                            return xyz;

                        case 5:
                            xyz = text * 3.280839895;
                            return xyz;

                        case 6:
                            xyz = text * 1.0936132983;
                            return xyz;

                        case 7:
                            xyz = text * 0.0006213712;
                            return xyz;

                        case 8:
                            xyz=text*0.0005399568;
                            return  xyz;
                        default:
                            return 0;
                    }
                case 3:
                    switch (s) {
                        case 0:
                            xyz = text * 1000000;
                            return xyz;
                        case 1:
                            xyz=text*100000;
                            return xyz;
                        case 2:
                            xyz=text*1000;
                            return xyz;
                        case 3:
                            return  text;
                        case 4:
                            xyz = text * 39370.0787402;
                            return xyz;

                        case 5:
                            xyz = text * 3280.839895;
                            return xyz;

                        case 6:
                            xyz = text * 1093.6132983;
                            return xyz;

                        case 7:
                            xyz = text * 0.6213712;
                            return xyz;

                        case 8:
                            xyz=text*0.5399568;
                            return  xyz;
                        default:
                            return 0;
                    }
                case 4:
                    switch (s) {
                        case 0:
                            xyz = text * 25.4;
                            return xyz;
                        case 1:
                            xyz=text*2.54;
                            return xyz;
                        case 2:
                            xyz=text*0.0254;
                            return xyz;
                        case 3:
                            xyz=0.0000254*text;
                            return  xyz;
                        case 4:
                            return  text;

                        case 5:
                            xyz = text * 0.0833333;
                            return xyz;

                        case 6:
                            xyz = text * 0.0277778;
                            return xyz;

                        case 7:
                            xyz = text * 0.0000157828;
                            return xyz;

                        case 8:
                            xyz=text*0.0000137149;
                            return  xyz;
                        default:
                            return 0;
                    }
                case 5:
                    switch (s) {
                        case 0:
                            xyz = text * 304.8;
                            return xyz;
                        case 1:
                            xyz=text*30.48;
                            return xyz;
                        case 2:
                            xyz=text*0.3048;
                            return xyz;
                        case 3:
                            xyz=0.0003048*text;
                            return  xyz;
                        case 4:
                            xyz=12*text;
                            return  xyz;
                        case 5:

                            return text;

                        case 6:
                            xyz = text * 0.333333;
                            return xyz;

                        case 7:
                            xyz = text * 0.0001893939;
                            return xyz;

                        case 8:
                            xyz=text*0.0001645788;
                            return  xyz;
                        default:
                            return 0;
                    }
                case 6:
                    switch (s) {
                        case 0:
                            xyz = text * 914.4;
                            return xyz;
                        case 1:
                            xyz=text*91.44;
                            return xyz;
                        case 2:
                            xyz=text*0.9144;
                            return xyz;
                        case 3:
                            xyz=0.0009144*text;
                            return  xyz;
                        case 4:
                            xyz=36*text;
                            return  xyz;
                        case 5:
                            xyz=text*3;
                            return  xyz;
                        case 6:
                            return text;
                        case 7:
                            xyz = text *0.0005681818;
                            return xyz;

                        case 8:
                            xyz=text*0.0004937365;
                            return  xyz;
                        default:
                            return 0;
                    }
                case 7:
                    switch (s) {
                        case 0:
                            xyz = text * 1609344;
                            return xyz;
                        case 1:
                            xyz=text*160934.4;
                            return xyz;
                        case 2:
                            xyz=text*1609.344;
                            return xyz;
                        case 3:
                            xyz=1.609344*text;
                            return  xyz;
                        case 4:
                            xyz=63360*text;
                            return  xyz;
                        case 5:
                            xyz=text*5280;
                            return  xyz;
                        case 6:
                            xyz=1760*text;
                            return xyz;
                        case 7:
                            return  text;
                        case 8:
                            xyz=text*0.8689762419;
                            return  xyz;
                        default:
                            return 0;
                    }
                case 8:
                    switch (s) {
                        case 0:
                            xyz = text * 1852000;
                            return xyz;
                        case 1:
                            xyz=text*185200;
                            return xyz;
                        case 2:
                            xyz=text*1852;
                            return xyz;
                        case 3:
                            xyz=1.852*text;
                            return  xyz;
                        case 4:
                            xyz=72913.385826771*text;
                            return  xyz;
                        case 5:
                            xyz=text*6076.1154855643;
                            return  xyz;
                        case 6:
                            xyz=2025.3718285214*text;
                            return xyz;
                        case 7:
                            xyz=1.150779448*text;
                            return xyz;
                        case 8:
                            return text;
                        default:
                            return 0;
                    }
                default:
                    return  0;

            }

        }

        public double compare3(int choice, int s, double xy) {
            double xyz;
            switch(choice)
            {
                case 0:
                    switch (s)
                    {
                        case 0:
                            return xy;
                        case 1:
                            xyz=xy*1000;
                            return xyz;
                        case 2:
                            xyz=2.2046226218*xy;
                            return xyz;
                        case 3:
                            xyz=35.2739619496*xy;
                            return xyz;

                        default:
                            return 0;

                    }
                case 1:
                    switch (s)
                    {
                        case 0:
                            xyz=xy*0.001;
                            return xyz;
                        case 1:
                            return xy;
                        case 2:
                            xyz=0.0022046226*xy;
                            return xyz;
                        case 3:
                            xyz=0.0352739619*xy;
                            return xyz;

                        default:
                            return 0;

                    }
                case 2:
                    switch (s)
                    {
                        case 0:
                            xyz=xy*0.45359237;
                            return xyz;
                        case 1:
                            xyz=xy*453.59237;
                            return xyz;
                        case 2:

                            return xy;
                        case 3:
                            xyz=16*xy;
                            return xyz;

                        default:
                            return 0;

                    }
                case 3:
                    switch (s)
                    {
                        case 0:
                            xyz=xy*0.0283495231;
                            return xyz;
                        case 1:
                            xyz=xy*28.349523125;
                            return xyz;
                        case 2:
                            xyz=0.0625*xy;
                            return xyz;
                        case 3:

                            return xy;

                        default:
                            return 0;

                    }
                default:
                    return 0;
            }
        }

    }





