package exercise;

import exercise.connections.Connection;
import exercise.connections.Disconnected;

import java.util.List;
import java.util.ArrayList;

// BEGIN
public class TcpConnection {
    private final String address;
    private final int port;
    public Connection connectionStatus;

    public List dataList;

    public TcpConnection(String address, int port) {
        this.address = address;
        this.port = port;
        this.dataList = new ArrayList<>();
        this.connectionStatus = new Disconnected(this);
    }

    public void connect() {
        connectionStatus.connect();
    }

    public void disconnect() {
        connectionStatus.disconnect();
    }

    public void write(String data) {
        connectionStatus.write(data);
    }

    public String getCurrentState() {
        return connectionStatus.getCurrentState();
    }
}
// END
