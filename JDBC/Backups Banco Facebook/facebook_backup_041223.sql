-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.4.20-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Copiando estrutura do banco de dados para facebook
DROP DATABASE IF EXISTS `facebook`;
CREATE DATABASE IF NOT EXISTS `facebook` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `facebook`;

-- Copiando estrutura para tabela facebook.posts
DROP TABLE IF EXISTS `posts`;
CREATE TABLE IF NOT EXISTS `posts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` text NOT NULL,
  `post_date` date NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `posts_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela facebook.posts: ~12 rows (aproximadamente)
/*!40000 ALTER TABLE `posts` DISABLE KEYS */;
INSERT INTO `posts` (`id`, `content`, `post_date`, `user_id`) VALUES
	(1, 'Olá do Emerson', '2023-12-04', 1),
	(2, 'Olá da Luiza', '2023-12-04', 2),
	(3, 'Olá da Denise', '2023-12-04', 3),
	(4, 'Olá do Noé', '2023-12-04', 4),
	(6, 'Olá do Emerson', '2023-12-04', 1),
	(7, 'Olá da Luiza', '2023-12-04', 2),
	(8, 'Olá da Denise', '2023-12-04', 3),
	(9, 'Olá do Noé', '2023-12-04', 4),
	(11, 'Olá do Emerson', '2023-12-04', 1),
	(12, 'Olá da Luiza', '2023-12-04', 2),
	(13, 'Olá da Denise', '2023-12-04', 3),
	(14, 'Olá do Noé', '2023-12-04', 4);
/*!40000 ALTER TABLE `posts` ENABLE KEYS */;

-- Copiando estrutura para tabela facebook.users
DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(150) NOT NULL,
  `sexo` enum('M','F') DEFAULT NULL,
  `email` varchar(150) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela facebook.users: ~16 rows (aproximadamente)
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` (`id`, `nome`, `sexo`, `email`) VALUES
	(1, 'Emerson Carvalho', 'M', 'emerson@mail.com'),
	(2, 'Luiza Carvalho', 'M', 'lu@mail.com'),
	(3, 'Denise Carvalho', 'M', 'de@mail.com'),
	(4, 'Noé Carvalho', 'M', 'noe@mail.com'),
	(5, 'Rosânia Carvalho', 'M', 'ro@mail.com'),
	(6, 'Emerson Carvalho', 'M', 'emerson@mail.com'),
	(7, 'Luiza Carvalho', 'M', 'lu@mail.com'),
	(8, 'Denise Carvalho', 'M', 'de@mail.com'),
	(9, 'Noé Carvalho', 'M', 'noe@mail.com'),
	(10, 'Rosânia Carvalho', 'M', 'ro@mail.com'),
	(11, 'Emerson Carvalho', 'M', 'emerson@mail.com'),
	(12, 'Luiza Carvalho', 'M', 'lu@mail.com'),
	(13, 'Denise Carvalho', 'M', 'de@mail.com'),
	(14, 'Noé Carvalho', 'M', 'noe@mail.com'),
	(15, 'Rosânia Carvalho', 'M', 'ro@mail.com'),
	(16, 'Emerson Teste DAO', 'M', 'emerson@gmail.com');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
