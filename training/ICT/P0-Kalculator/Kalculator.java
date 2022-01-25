import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Kalculator {

    List<Double> data = new ArrayList<Double>();

    public Kalculator() {
    }

    public void addNumber(double number) {
        data.add(number);
    }

    public void deleteFirstNumber() {
        if (data.size() > 0) {
            data.remove(0);
        }
    }

    public void deleteLastNumber() {
        if (data.size() > 0) {
            data.remove(data.size() - 1);
        }
    }

    public double getSum() {
        if (data.size() > 0) {
            double sum = 0;
            for (double d : data) {
                sum += d;
            }
            return sum;
        } else {
            return 0;
        }

    }

    public double getAvg() {
        if (data.size() > 0) {
            return getSum() / data.size();
        } else {
            return 0;
        }
    }

    public double getStd() {
        if (data.size() > 1) {
            double avg = getAvg();
            double std = 0;
            for (double d : data) {
                std += Math.pow(d - avg, 2);
            }
            return Math.sqrt(std / data.size());
        } else {
            return 0;
        }
    }

    public double getMax() {
        if (data.size() > 0) {
            double max = data.get(0);
            for (double d : data) {
                if (d > max) {
                    max = d;
                }
            }
            return max;
        } else {
            return 0;
        }
    }

    public double getMin() {
        if (data.size() > 0) {
            double min = data.get(0);
            for (double d : data) {
                if (d < min) {
                    min = d;
                }
            }
            return min;
        } else {
            return 0;
        }
    }

    public double[] getMaxK(int k) {

        if (data.size() >= k) {

            List<Double> temp_list = new ArrayList<>(data);

            Collections.sort(temp_list, Collections.reverseOrder());

            temp_list = temp_list.subList(0, k);

            return temp_list.stream().mapToDouble(Double::doubleValue).toArray();
        }
        else return null;
    }

    public double[] getMinK(int k) {

        if (data.size() >= k) {

            List<Double> temp_list = new ArrayList<>(data);

            Collections.sort(temp_list);

            temp_list = temp_list.subList(0, k);

            return temp_list.stream().mapToDouble(Double::doubleValue).toArray();
    
        }
        else return null;
    }

    public void printData() {
        System.out.printf("DATA[%d]:%s\n",data.size(), data.toString());
    }

}
