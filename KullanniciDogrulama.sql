--
-- PostgreSQL database dump
--

-- Dumped from database version 12.1
-- Dumped by pg_dump version 12rc1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: Kullanici; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Kullanici" (
    "kullaniciAdi" character varying(2044) NOT NULL,
    "kullaniciNumarasi" integer NOT NULL,
    sifre integer NOT NULL,
    "kullaniciTuru" integer NOT NULL
);


ALTER TABLE public."Kullanici" OWNER TO postgres;

--
-- Data for Name: Kullanici; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."Kullanici" VALUES ('kullanici1', 1, 123, 1);
INSERT INTO public."Kullanici" VALUES ('kullanici2', 2, 456, 2);
INSERT INTO public."Kullanici" VALUES ('kullanici3', 3, 789, 3);
INSERT INTO public."Kullanici" VALUES ('kullanici4', 4, 147, 4);


--
-- Name: Kullanici Kullanici_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Kullanici"
    ADD CONSTRAINT "Kullanici_pkey" PRIMARY KEY ("kullaniciNumarasi");


--
-- Name: Kullanici unique_Kullanici_kullaniciNumarasi; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Kullanici"
    ADD CONSTRAINT "unique_Kullanici_kullaniciNumarasi" UNIQUE ("kullaniciNumarasi");


--
-- PostgreSQL database dump complete
--

