# 🤖 WhatsApp Chatbot Backend Simulation

This project is a simple backend simulation of a WhatsApp chatbot built using **Java Spring Boot**.

## 🚀 Features

* REST API endpoint `/webhook` to receive messages
* Accepts JSON input simulating WhatsApp messages
* Responds with predefined replies:

  * Hi → Hello
  * Bye → Goodbye
  * How are you → I'm a chatbot built with Spring Boot, and I'm doing great!
* Logs all incoming messages in the console

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Maven

---

## 📡 API Endpoint

### POST `/webhook`

### Request Body

```json
{
  "message": "Hi"
}
```

### Response

```json
{
  "reply": "Hello"
}
```

---

## ▶️ How to Run Locally

1. Clone the repository:

```bash
git clone https://github.com/your-username/chatbot-project.git
```

2. Navigate to the project:

```bash
cd chatbot-project
```

3. Run the application:

```bash
mvn spring-boot:run
```

4. Test using Postman:

```
http://localhost:8080/webhook
```

---

## 🧪 Example Responses

| Input       | Output                                                     |
| ----------- | ---------------------------------------------------------- |
| Hi          | Hello                                                      |
| Bye         | Goodbye                                                    |
| How are you | I'm a chatbot built with Spring Boot, and I'm doing great! |

---

## 🎥 Demo

(Attach your demo video link here)

---

## 📌 Author

Mukul Sharma
