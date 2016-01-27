package taxi.service;

import taxi.domain.*;

import java.util.List;

public interface TService {
    List<Client> clientsPortinedByTen(Long numberOfPortion);

    List<Client> clientsMadeOrdersDuringLastMonth();

    List<Client> clientswithOrderAmountMoreThen(Long amount);

    Long createClient(Client client);

    Client readClient(Long id);

    boolean updateClient(Client client);

    boolean deleteClient(Client client);

    List<Client> findAllClients();

    String createOperator(Operator operator);

    Operator readOperator(String login);

    boolean updateOperator(Operator operator);

    boolean deleteOperator(Operator operator);

    List<Operator> findAllOperators();

    Long createOrder(Order order);

    Order readOrder(Long id);

    void updateOrder(Order order);

    void deleteOrder(Order order);

    List listAllOrders();

    List listOfOrdersInRangeOfAmount(Long from, Long to);

    List listOfOrdersChunk(int startPoint, int chunkSize);

    String createRole(Role role);

    Role readRole(String roleName);

    boolean updateRole(Role role);

    boolean deleteRole(Role role);

    List<Role> findAllRoles();

    TaxiDriver readTaxist(Long id);

    Long createTaxist(TaxiDriver taxiDriver);

    boolean updateTaxist(TaxiDriver taxiDriver);

    boolean deleteTaxist(TaxiDriver taxiDriver);

    List findAllTaxists();
}
