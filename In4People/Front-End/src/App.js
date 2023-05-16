import { BrowserRouter, Routes, Route } from "react-router-dom";
import Layout from "./layouts/Layout";
import TaskSidebar from "./pages/task/TaskSidebar";
import ApprovalSubmit from "./pages/task/taskApproval/ApprovalSubmit";
import Main from "./pages/main/Main";
import ApprovalBookmark from "./pages/task/taskApproval/ApprovalBookmark";
import ApprovalNeed from "./pages/task/taskApproval/ApprovalNeed";
import ApprovalCompleted from "./pages/task/taskApproval/ApprovalCompleted";
import ApprovalRefered from "./pages/task/taskApproval/ApprovalRefered";
import Login from "./pages/login/Login";


function App() {

  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Layout />}>
          <Route index element={<Main />} />
          <Route path="task" element={<TaskSidebar />}>
            <Route index element={<ApprovalSubmit />} />
            <Route path="bookMark" element={<ApprovalBookmark />} />
            <Route path="submit" element={<ApprovalSubmit />} />
            <Route path="needed" element={<ApprovalNeed />} />
            <Route path="completed" element={<ApprovalCompleted />} />
            <Route path="refered" element={<ApprovalRefered />} />
          </Route>
        </Route>

        <Route path="/login" element={<Login />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;
