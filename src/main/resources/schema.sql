DROP TABLE IF EXISTS attribute;
DROP TABLE IF EXISTS account;
DROP TABLE IF EXISTS account_type;
DROP TABLE IF EXISTS subject;
------------------------------------------------------------
CREATE TABLE subject
(
    id           UUID NOT NULL,
    subject_name VARCHAR(255),
    CONSTRAINT pk_subject PRIMARY KEY (id)
);
------------------------------------------------------------
CREATE TABLE account_type
(
    id        UUID NOT NULL,
    type_name VARCHAR(255),
    CONSTRAINT pk_account_type PRIMARY KEY (id)
);
------------------------------------------------------------
CREATE TABLE account
(
    id              UUID NOT NULL,
    account_number  VARCHAR(255),
    is_open         BOOLEAN,
    account_type_id UUID,
    subject_id      UUID,
    CONSTRAINT pk_account PRIMARY KEY (id)
);
ALTER TABLE account
    ADD CONSTRAINT FK_ACCOUNT_ON_ACCOUNT_TYPE FOREIGN KEY (account_type_id) REFERENCES account_type (id);
ALTER TABLE account
    ADD CONSTRAINT FK_ACCOUNT_ON_SUBJECT FOREIGN KEY (subject_id) REFERENCES subject (id);
CREATE INDEX acc_number_idx1 ON account (account_number);
------------------------------------------------------------
CREATE TABLE attribute
(
    id             UUID NOT NULL,
    attribute_name VARCHAR(255),
    subject_id     UUID,
    CONSTRAINT pk_attribute PRIMARY KEY (id)
);
ALTER TABLE attribute
    ADD CONSTRAINT FK_ATTRIBUTE_ON_SUBJECT FOREIGN KEY (subject_id) REFERENCES subject (id);
------------------------------------------------------------
------------------------------------------------------------
