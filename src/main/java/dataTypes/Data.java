package dataTypes;

import java.util.*;

public class Data {

    private static final String ILLEGAL_DATA_MSG = "There must be the same number of input and output data points";

    private List<Double> input;
    private List<Double> output;

    public Data(List<Double> input, List<Double> output) {
        this.input = input;
        this.output = output;

        checkIfDataValid(input,output);
    }

    public Data(int inputSize, int outputSize) {
        this(new ArrayList<>(inputSize),new ArrayList<>(outputSize));
    }

    public double getInputPoint(int index) {
        return input.get(index);
    }

    public double getOutputPoint(int index) {
        return output.get(index);
    }

    public void addInput(double inputPoint) {
        input.add(inputPoint);
    }

    public void addOutput(double outputPoint) {
        output.add(outputPoint);
    }

    public void addInputs(List<Double> inputs) {
        input.addAll(inputs);
    }

    public void addOutputs(List<Double> outputs) {
        input.addAll(outputs);
    }

    public void addInputs(Double... inputs) {
        addInputs(Arrays.asList(inputs));
    }

    public void addOutputs(Double... outputs) {
        addOutputs(Arrays.asList(outputs));
    }

    private void checkIfDataValid(List input, List output) throws IllegalArgumentException {
        if(input.size() != output.size())
            throw new IllegalArgumentException(ILLEGAL_DATA_MSG);
    }

    public List<Double> getInputPoints() {
        return input;
    }

    public List<Double> getOutputPoints() {
        return output;
    }
}
