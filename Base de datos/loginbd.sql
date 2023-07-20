-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: loginbd
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `idUsuario` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `Apellidos` varchar(45) NOT NULL,
  `Correo` varchar(45) NOT NULL,
  `Contraseña` varchar(45) NOT NULL,
  `CURP` varchar(18) NOT NULL,
  `PalSeg` varchar(45) NOT NULL,
  `Admin` char(1) NOT NULL,
  PRIMARY KEY (`idUsuario`),
  UNIQUE KEY `idUsuario_UNIQUE` (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Pepe','Perez','correo@correo.com','EstaEsLaContraseña','XXXXXXXXXXXXXXXXXX','Frijol','S'),(17,'Pepe','Perez','correo@correo.com','EstaEsLaContraseña','XXXXXXXXXXXXXXXXXX','Rocky','N'),(18,'Pepe','Perez','correo@correo.com','EstaEsLaContraseña','XXXXXXXXXXXXXXXXXX','Negro','N'),(19,'Pepe','Perez','correo@correo.com','EstaEsLaContraseña','XXXXXXXXXXXXXXXXXX','Negro','N'),(20,'Pepe','Perez','correo@correo.com','EstaEsLaContraseña','XXXXXXXXXXXXXXXXXX','Negro','N'),(23,'Pepe','Perez','correo@correo.com','EstaEsLaContraseña','XXXXXXXXXXXXXXXXXX','luneta','N'),(24,'Pepe','Perez','correo@correo.com','EstaEsLaContraseña','XXXXXXXXXXXXXXXXXX','si','N'),(25,'Pepe','Perez','correo@correo.com','EstaEsLaContraseña','XXXXXXXXXXXXXXXXXX','pelota','N'),(26,'Pepe','Perez','correo@correo.com','EstaEsLaContraseña','XXXXXXXXXXXXXXXXXX','televisión','N'),(27,'Pepe','Perez','correo@correo.com','EstaEsLaContraseña','XXXXXXXXXXXXXXXXXX','frijol','N'),(28,'Pepe','Perez','correo@correo.com','EstaEsLaContraseña','XXXXXXXXXXXXXXXXXX','Xiaomi','N');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-07-20 15:02:44
