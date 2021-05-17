CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS "users"  (
  "id" UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  "full_name" varchar,
  "email" varchar UNIQUE NOT NULL,
  "profile_picture" varchar,
  "address" varchar,
  "city" varchar,
  "password" varchar,
  "sex" int,
  "birth_date" date,
  "created_at" date DEFAULT (now()),
  "updated_at" date,
  "deleted" int
);

CREATE TABLE IF NOT EXISTS "plants" (
  "id" UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  "plant_name" varchar UNIQUE NOT NULL,
  "plant_class" varchar,
  "plant_species" varchar,
  "plant_humidity" decimal,
  "plant_lighting" decimal,
  "plant_fertilizer" decimal,
  "plant_price" decimal,
  "plant_sales_price" decimal,
  "plant_month_harvest" varchar,
  "plant_preparation" text,
  "created_at" date DEFAULT (now()),
  "updated_at" date,
  "deleted" int
);

CREATE TABLE IF NOT EXISTS "plant_diseases" (
  "id" UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  "disease_name" varchar UNIQUE NOT NULL,
  "disease_detail" text,
  "disease_treatment" text,
  "disease_treatment_videos" text,
  "created_at" date DEFAULT (now()),
  "updated_at" date,
  "deleted" int
);

CREATE TABLE IF NOT EXISTS "user_plants" (
  "id" UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  "plant_id" UUID,
  "user_id" UUID,
  "user_plant_name" varchar,
  "plant_health" decimal,
  "plant_image" varchar,
  "plant_detail" text,
  "plant_phase" varchar,
  "plant_suggestion" text,
  "created_at" date DEFAULT (now()),
  "updated_at" date,
  "deleted" int
);

CREATE TABLE IF NOT EXISTS "user_plant_checkups" (
  "id" UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  "user_plant_id" UUID,
  "user_plant_humidity" decimal,
  "user_plant_temperature" decimal,
  "user_plant_nitrogen" decimal,
  "user_plant_potassium" decimal,
  "user_plant_phosphorus" decimal,
  "created_at" date DEFAULT (now()),
  "updated_at" date,
  "deleted" int
);

CREATE TABLE IF NOT EXISTS "user_plant_diseases" (
  "id" UUID PRIMARY KEY DEFAULT uuid_generate_v4(),
  "user_plant_id" UUID,
  "plant_disease_id" UUID,
  "created_at" date DEFAULT (now()),
  "updated_at" date,
  "deleted" int
);

ALTER TABLE "user_plants" ADD FOREIGN KEY ("plant_id") REFERENCES "plants" ("id");

ALTER TABLE "user_plants" ADD FOREIGN KEY ("user_id") REFERENCES "users" ("id");

ALTER TABLE "user_plant_checkups" ADD FOREIGN KEY ("user_plant_id") REFERENCES "user_plants" ("id");

ALTER TABLE "user_plant_diseases" ADD FOREIGN KEY ("user_plant_id") REFERENCES "user_plants" ("id");

ALTER TABLE "user_plant_diseases" ADD FOREIGN KEY ("plant_disease_id") REFERENCES "plant_diseases" ("id");

INSERT INTO USERS (full_name, email, password) VALUES ('value1', 'value7', 'value3');