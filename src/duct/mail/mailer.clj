(ns duct.mail.mailer
  (:require
    [integrant.core :as ig]))


(defrecord Boundary [spec logger])

(defmethod ig/init-key :duct.mail/mailer [_ conf]
  (->Boundary (dissoc conf :logger) (:logger conf)))
