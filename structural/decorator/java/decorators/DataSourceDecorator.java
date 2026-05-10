package structural.decorator.java.decorators;

import structural.decorator.java.datasources.DataSource;

public class DataSourceDecorator implements DataSource {

    protected DataSource wrapped;

    public DataSourceDecorator(DataSource dataSource){
        this.wrapped = dataSource;
    }

    @Override
    public boolean writeData(String data) {
        return wrapped.writeData(data);
    }

    @Override
    public String readData() {
        return wrapped.readData();
    }
}

