package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Disconnected implements Connection {
    private TcpConnection tcpConnection;

    public Disconnected(TcpConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }
    @Override
    public void connect() {
        tcpConnection.connectionStatus = new Connected(tcpConnection);
    }

    @Override
    public void disconnect() {
        System.out.println("Error: connection is not established!");
    }

    @Override
    public void write(String data) {
        System.out.println("Error: connection is not established!");
    }

    @Override
    public String getCurrentState() {
        return "disconnected";
    }
}
// END
