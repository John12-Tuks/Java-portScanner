# 🚀 Java TCP Port Scanner

A lightweight, efficient, and educational **TCP Port Scanner built in Java** that identifies open ports on a target host within a specified range.

This project demonstrates practical understanding of:

- Low-level networking concepts  
- TCP socket communication  
- Exception handling & timeout control  
- Command-line interface design  
- Secure and responsible security testing practices  

---

## 📖 Project Overview

The Java TCP Port Scanner attempts to establish socket connections to a specified host across a defined port range.  

If a connection is successfully established, the port is marked as **open**. Otherwise, it is considered **closed or filtered**.

This project was developed to strengthen foundational cybersecurity and networking skills while applying clean Java design principles.

---

## ✨ Key Features

- ✔ Custom target host (IP address or domain name)  
- ✔ Configurable port range  
- ✔ Real-time scan output  
- ✔ Timeout handling to avoid long waits  
- ✔ Lightweight and dependency-free  
- ✔ Clean, readable object-oriented structure  

---

## 🛠 Tech Stack

- **Language:** Java  
- **Core Libraries:** `java.net.Socket`, `InetAddress`  
---

## ⚙️ How It Works

1. The user provides:
   - Target host  
   - Start port  
   - End port  

2. The program:
   - Iterates through the port range  
   - Attempts to open a TCP socket connection  
   - Reports open ports in real-time  

3. Closed or unreachable ports are handled gracefully using exception management.

---

## 🖥 Installation & Execution

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/yourusername/java-port-scanner.git
cd java-port-scanner
