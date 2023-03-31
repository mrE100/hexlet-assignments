package exercise.connections;

import exercise.TcpConnection;

// BEGIN
public class Connected implements Connection {
    private TcpConnection tcpConnection;

    public Connected(TcpConnection tcpConnection) {
        this.tcpConnection = tcpConnection;
    }

    @Override
    public void connect() {
        System.out.println("Error: connection already established!");
    }

    @Override
    public void disconnect() {
        tcpConnection.connectionStatus = new Disconnected(tcpConnection);
    }

    @Override
    public void write(String data) {
        tcpConnection.dataList.add(data);
    }

    @Override
    public String getCurrentState() {
        return "connected";
    }
}
// END
