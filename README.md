# 🍷 Winery SOAP WebService

Projeto desenvolvido para a disciplina de **Arquitetura SOA e Web Services**.

---

## 👨‍💻 Integrantes

-Vinicius Oliveira RM556908

-Enzo Dias RM558225

-Gustavo Pierre RM558928

-Gabriel Belo RM551669

-Laura Souza RM556320

---

## 🚀 Tecnologias utilizadas

* Java
* Maven
* SOAP (JAX-WS)

---

## 📁 Estrutura do Projeto

```
Winery/
 ├── Publisher/
 │    └── WinerySys        (Servidor SOAP)
 └── Consumer/
      ├── WineStockClient  (Cliente - Menu)
      └── WineOrderClient  (Cliente - Pedido + Aviso)
```

---

## 📡 Serviços disponíveis

### 🍷 WineStockService

* `getMenu()` → Retorna o menu de vinhos
* `placeOrder(String name, int quantity)` → Realiza um pedido

📍 Endpoint:

```
http://localhost:8085/WineStockService
```

---

### ⚠️ WineWarningService

* `sendWarn()` → Retorna aviso de estoque

📍 Endpoint:

```
http://localhost:8086/WineWarningService
```

---

## ▶️ Como executar

### 🔹 1. Rodar o servidor

```bash
cd Publisher/WinerySys
mvn exec:java
```

---

### 🔹 2. Testar no navegador

```
http://localhost:8085/WineStockService?wsdl
http://localhost:8086/WineWarningService?wsdl
```

---

### 🔹 3. Rodar o cliente principal

```bash
cd Consumer/WineOrderClient
mvn exec:java
```

---

## 🎉 Resultado esperado

```
📦 PEDIDO:
Pedido confirmado: 2x Merlot

⚠️ AVISO:
Estoque insuficiente!
```

---

## 🧠 Conceitos aplicados

* Arquitetura Orientada a Serviços (SOA)
* Web Services SOAP
* Comunicação cliente-servidor via WSDL
* Uso de Maven para build e execução

---

## 📌 Observações

* O servidor deve estar em execução antes de rodar os clientes.
* As portas utilizadas são:

  * 8085 → WineStockService
  * 8086 → WineWarningService

---

