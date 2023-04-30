-- MariaDB dump 10.19  Distrib 10.11.2-MariaDB, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: chambeaya
-- ------------------------------------------------------
-- Server version	10.11.2-MariaDB-1:10.11.2+maria~ubu2204

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `anuncio`
--

DROP TABLE IF EXISTS `anuncio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `anuncio` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) DEFAULT NULL,
  `nombre_negocio` varchar(64) DEFAULT NULL,
  `descripcion_pequeña` varchar(140) DEFAULT NULL,
  `descripcion_completa` varchar(2000) DEFAULT NULL,
  `codigo_postal` varchar(10) DEFAULT NULL,
  `oficio` varchar(64) DEFAULT NULL,
  `telefono_negocio` varchar(64) DEFAULT NULL,
  `correo_negocio` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anuncio`
--

LOCK TABLES `anuncio` WRITE;
/*!40000 ALTER TABLE `anuncio` DISABLE KEYS */;
INSERT INTO `anuncio` VALUES
(2,74,'sdfhsdfh','asdfasdf','asdfasdf','654654','carpintero','3154351','mi caprintesra@mai.lcom'),
(3,54,'fgjhwdg',NULL,NULL,NULL,'carpintero',NULL,NULL),
(5,45,'sijaloya','feli porque va a jalar','feli','86690','oficio','9141050734','probandoapi@simon.com'),
(6,17,'adgsdg','taco',NULL,NULL,'carpintero',NULL,NULL),
(44,49,'nn','dp','dc','cp','oficio','tn','correo'),
(47,78,'fasdfasdf','asdfasdf','hola amigos de yutu',NULL,'plomero',NULL,NULL);
/*!40000 ALTER TABLE `anuncio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gasto`
--

DROP TABLE IF EXISTS `gasto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gasto` (
  `id` int(11) NOT NULL,
  `id_user` decimal(10,0) DEFAULT NULL,
  `monto` varchar(32) DEFAULT NULL,
  `dia` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gasto`
--

LOCK TABLES `gasto` WRITE;
/*!40000 ALTER TABLE `gasto` DISABLE KEYS */;
INSERT INTO `gasto` VALUES
(1,49,'45.28','mon'),
(2,49,'14.89','tue'),
(3,49,'74.23','wed'),
(4,49,'61.58','thu'),
(5,49,'85.91','fri'),
(6,49,'94.36','sat'),
(7,49,'72.81','sun'),
(8,48,'24.17','mon');
/*!40000 ALTER TABLE `gasto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `oficio`
--

DROP TABLE IF EXISTS `oficio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `oficio` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_oficio` int(11) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `oficio`
--

LOCK TABLES `oficio` WRITE;
/*!40000 ALTER TABLE `oficio` DISABLE KEYS */;
INSERT INTO `oficio` VALUES
(1,0,'Afilador'),
(2,1,'Albañil'),
(3,2,'Azulejero'),
(4,3,'Basurero'),
(5,4,'Bolero'),
(6,5,'Camionero'),
(7,6,'Cantinero'),
(8,7,'Carpintero'),
(9,8,'Cerrajero'),
(10,9,'Chatarrero'),
(11,10,'Chofer'),
(12,11,'Coach'),
(13,12,'Cobrador'),
(14,13,'Cocinero'),
(15,14,'Comediante'),
(16,15,'Cuidadora'),
(17,16,'Electricista'),
(18,17,'Entrenador'),
(19,18,'Entrevistador'),
(20,19,'Escultor'),
(21,20,'Estilista'),
(22,21,'Franelero'),
(23,22,'Gasero'),
(24,23,'Guardaespaldas'),
(25,24,'Guardia'),
(26,25,'Herrero'),
(27,26,'Instructor'),
(28,27,'Investigador Privado'),
(29,28,'Jardinero'),
(30,29,'Locutor'),
(31,30,'Luchador'),
(32,31,'Mariachi'),
(33,32,'Masajsita'),
(34,33,'Mecanico'),
(35,34,'Orfebre'),
(36,35,'Panadero'),
(37,36,'Paramedico'),
(38,37,'Payaso'),
(39,38,'Peluquero'),
(40,39,'Pescador'),
(41,40,'Pintor'),
(42,41,'Plomero'),
(43,42,'Rescatista'),
(44,43,'Secretaria'),
(45,44,'Sirvienta'),
(46,45,'Taquero'),
(47,46,'Traductor'),
(48,47,'Transportista'),
(49,48,'Velador'),
(50,49,'Zapatero'),
(51,50,'Otro');
/*!40000 ALTER TABLE `oficio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persona` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `ap_paterno` varchar(45) DEFAULT NULL,
  `ap_materno` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `fecha_nacimiento` varchar(45) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  `municipio` varchar(45) DEFAULT NULL,
  `colonia` varchar(45) DEFAULT NULL,
  `codigo_postal` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES
(2,'we','string','string','string','string','si','string','cambio','string'),
(3,'asdfasdf','asdfasdfs','asdfasdfasd','asdfsadf','asdfasdfasdf','sadfsdf','asdfasdf','asdfasdfa',NULL),
(5,'string','sijalo','adios','string','string','string','string','string','string'),
(6,'string','string','string','string','string','string','string','string','string'),
(7,'string','string','string','string','string','string','string','string','string'),
(49,'Josue','Gonzalez','Perez','4446004136','1999-02-15','Tabasco','Cunduacan','Centro','86690'),
(50,'string','string','string','string','string','string','string','string','string'),
(51,'asdfasdf','asdfasdf','asdfasdf','asdfasdf','2023-04-17','cdmx','asdfasdf','Elegir colonia','asdfasdf'),
(52,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(53,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(54,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(55,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(56,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(57,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
(58,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tarjeta`
--

DROP TABLE IF EXISTS `tarjeta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tarjeta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) DEFAULT NULL,
  `tipo` varchar(45) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `numero` varchar(45) DEFAULT NULL,
  `mes` varchar(45) DEFAULT NULL,
  `anio` varchar(45) DEFAULT NULL,
  `cvv` varchar(45) DEFAULT NULL,
  `company` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tarjeta`
--

LOCK TABLES `tarjeta` WRITE;
/*!40000 ALTER TABLE `tarjeta` DISABLE KEYS */;
INSERT INTO `tarjeta` VALUES
(1,49,'debito','Josue','12345678','05','24','147','visa'),
(2,49,'credito','Josue','12456789','12','12','457','mastercard');
/*!40000 ALTER TABLE `tarjeta` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-25  3:18:21
