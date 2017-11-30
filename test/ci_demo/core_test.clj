(ns ci-demo.core-test
  (:require [clojure.test :refer :all]
            [ci-demo.core :refer :all]
            [korma.core :refer [select where exec-raw fields]]
            [korma.db :refer [defdb postgres]]
            [clojure.string :as str]
            [clj-yaml.core :as yaml]
            [clojure.java.jdbc :as j]))

;; (let [yaml-file (slurp "./config/db.yml")
;;       parsed (yaml/parse-string yaml-file)
;;       db-config (-> parsed :test :db_connection)]
;;   (defdb db (postgres (merge db-config {:user (:username db-config)}))))
;;


(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 #_(first (vals (first (exec-raw ["SELECT 1" ] :results)))) 1))))
