CREATE TABLE if NOT EXISTS users (
    id INTEGER auto_increment,
    user_name VARCHAR(50),
    pass VARCHAR(100),
    PRIMARY KEY (id)
);

CREATE TABLE if NOT EXISTS extended_users (
    id INTEGER auto_increment,
    name VARCHAR(20),
    surname VARCHAR(20),
    fathers_name VARCHAR(20),
    is_sub SMALLINT,
    PRIMARY KEY (id)
)

CREATE TABLE if NOT EXISTS users_of_couch {
    id INTEGER auto_increment,
    name VARCHAR(41),
    program_type VARCHAR(50),
    is_training_plan SMALLINT,
    is_diet_plan SMALLINT,
    height SMALLINT,
    weight SMALLINT,
    age SMALLINT,
    training_experience VARCHAR(10),
    previous_program VARCHAR(50),
    health VARCHAR(70),
    muscle_target VARCHAR(20),
    diet_target VARCHAR(20),
    special_program VARCHAR(50),
    photo VARCHAR(50),
    equipment VARCHAR(50),
    activity_level VARCHAR(50)
    PRIMARY KEY (id)
}