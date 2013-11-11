(load-file "../src/core.cl2")

(ng-test my-app
  (:controller my-ctrl
    (:tabular
     (add-two 1) {:result 3}))

  (:service my-service
    (:tabular
     (add-three 1) 4))

  (:filter my-filter
    (:tabular
     [1] 6))

  (:filter your-filter
    (:tabular
     [2] 8))

  (:directive my-directive
    (:tabular
     [:div {:my-directive "foo"}]
     {:foo 2}
     ;; Calling $compile function against provided template and scope
     ;; returns an element.
     ;; `(text)` (the same as `text` because they're called by `..` macro)
     ;; is method call of that element.
     ;; These methods are provided by Angular's jQuery lite
     ;; To get full list of them, consult `angular.element` section
     ;; in AngularJS Global APIs.
     "6" text
     "6" (text))))

;; Local Variables:
;; mode: clojure
;; eval: (define-clojure-indent
;;         (ng-test (quote defun))
;;         (:controller (quote defun))
;;         (:service (quote defun))
;;         (:filter (quote defun))
;;         (:directive (quote defun))
;;         (:factory (quote defun)))
;; End:
